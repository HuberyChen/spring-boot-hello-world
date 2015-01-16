package cn.suryani.trainning;

import java.util.HashSet;
import java.util.Set;

/**
 * Created by Robin.Lian on 2014/11/27.
 */
public class Cache {

    public static final String USER_CACHE_NAME = "user";

    public static final Set<String> CACHE_NAMES = new HashSet<>();

    static {
        CACHE_NAMES.add(USER_CACHE_NAME);
    }

}
