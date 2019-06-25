package cn.chenhaoxiang.util;

import cn.chenhaoxiang.enums.CodeEnum;

/**
 * EnumUtil:枚举工具类
 * @author zhangxiaoxiang
 * @date 2019/6/16
 */
public class EnumUtil {
    /**
     * 通过code和枚举类型获取枚举
     *
     * @param code      code
     * @param enumClass 枚举类型class
     * @param <T>       枚举类型
     * @return
     */
    public static <T extends CodeEnum> T getByCode(Integer code, Class<T> enumClass) {
        //遍历枚举类型
        for (T each : enumClass.getEnumConstants()) {
            if (each.getCode().equals(code)) {
                return each;
            }
        }
        return null;
    }
}
