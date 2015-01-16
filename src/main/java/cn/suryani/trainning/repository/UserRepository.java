package cn.suryani.trainning.repository;

import cn.suryani.trainning.Cache;
import cn.suryani.trainning.domain.User;
import org.springframework.cache.annotation.CachePut;
import org.springframework.cache.annotation.Cacheable;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

/**
 * Created by Robin.Lian on 2014/11/27.
 */
@Repository
public interface UserRepository extends CrudRepository<User, Integer> {

    @Override
    @CachePut(value = Cache.USER_CACHE_NAME, key = "#p0.id")
    <S extends User> S save(S entity);

    @Override
    @Cacheable(value = Cache.USER_CACHE_NAME, key = "#p0")
    User findOne(Integer integer);

}
