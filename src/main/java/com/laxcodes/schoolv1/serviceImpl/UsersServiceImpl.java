package com.laxcodes.schoolv1.serviceImpl;

import com.laxcodes.schoolv1.dtoModels.UserDto;
import com.laxcodes.schoolv1.entities.Users;
import com.laxcodes.schoolv1.enums.ActionStatus;
import com.laxcodes.schoolv1.enums.UserRole;
import com.laxcodes.schoolv1.repository.UsersRepo;
import com.laxcodes.schoolv1.security.models.RegRequest;
import com.laxcodes.schoolv1.service.UsersService;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@RequiredArgsConstructor
@Service
public class UsersServiceImpl implements UsersService {
    private final UsersRepo usersRepo;

    @Override
    public Long registerNewUser(RegRequest regRequest, UserRole role) {
        if(regRequest.getEmail() != null && regRequest.getPassword() != null){
            Optional<Users> byEmail = usersRepo.findByEmail(regRequest.getEmail());
            if(byEmail.isEmpty()){
                Users users = saveUser(new Users(regRequest, role));
                return users.getId();
            }
        }
        return 0L;
    }

    @Override
    public ActionStatus updateUser(UserDto userdto) {
        Users user = findUser(userdto.getEmail());
        user.setAddress(userdto.getAddress());
        user.setLastName(userdto.getLastName());
        user.setFirstName(userdto.getFirstName());
        user.setPhoneNumber(userdto.getPhoneNumber());
        user.setDateOfBirth(userdto.getDateOfBirth());
        Users users = saveUser(user);
        return users.getId() == user.getId() ? ActionStatus.SUCCESS : ActionStatus.FAILED;
    }

    @Override
    public Users findUser(String email, UserRole userRole) {
        Optional<Users> byEmailAndUserRole = usersRepo.findByEmailAndUserRole(email, userRole);
        return byEmailAndUserRole.orElse(null);
    }

    @Override
    public Users findUser(long id, UserRole userRole) {
        Optional<Users> byIdAndUserRole = usersRepo.findByIdAndUserRole(id, userRole);
        return byIdAndUserRole.orElse(null);
    }

    @Override
    public Users findUser(String email) {
        Optional<Users> byEmail = usersRepo.findByEmail(email);
        return byEmail.orElse(null);
    }
    @Override
    public Users findUser(long id) {
        Optional<Users> byId = usersRepo.findById(id);
        return byId.orElse(null);
    }

    @Override
    public ActionStatus deleteUser(String email) {
        Users user = findUser(email);
        if(user!= null) {
            usersRepo.deleteById(user.getId());
            Users user1 = findUser(user.getId());
                return user1 != null ? ActionStatus.FAILED: ActionStatus.SUCCESS;
        }
        return ActionStatus.FAILED;
    }

    @Override
    public List<Users> getListOfStudents() {
        return usersRepo.findAllByUserRole(UserRole.STUDENT);
    }

    @Override
    public List<Users> getListOfStaff() {
        return usersRepo.findAllByUserRole(UserRole.STAFF);
    }

    private Users saveUser(Users users){
        return usersRepo.save(users);
    }
}
