package enums;

import cn.hutool.core.util.ArrayUtil;
import core.IntArrayValuable;
import lombok.AllArgsConstructor;
import lombok.Getter;

import java.util.Arrays;

/**
 * 全局用户类型枚举
 */
@AllArgsConstructor
@Getter
public enum UserTypeEnum implements IntArrayValuable {

    MEMBER(1,"会员"),
    ADMIN(2,"管理员");

    /**
     * 类型
      */
    private final Integer value;

    /**
     * 类型名
     */
    private final String name;

    public static final int[] ARRAYS = Arrays.stream(values()).mapToInt(UserTypeEnum::getValue).toArray();

    private static UserTypeEnum valueOf(Integer value) {
        return ArrayUtil.firstMatch(userType -> userType.getValue().equals(value),UserTypeEnum.values());
    }

    @Override
    public int[] array() {
        return ARRAYS;
    }
}
