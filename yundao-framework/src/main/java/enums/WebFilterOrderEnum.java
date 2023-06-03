package enums;

/**
 * Web过滤器顺序的枚举类，保证过滤器按照符合我们的预期
 * 考虑到每个starter都需要用到该工具类，所以放到common模块的enum包下
 */
public interface WebFilterOrderEnum {

    Integer CORS_FILTER = Integer.MIN_VALUE;

    Integer TRACE_FILTER = CORS_FILTER + 1;

    Integer ENV_TAG_FILTER = TRACE_FILTER + 1;

    Integer REQUEST_BODY_CACHE_FILTER = Integer.MIN_VALUE + 500;

    Integer TENANT_CONTEXT_FILTER = -104;

    Integer API_ACCESS_LOG_FILTER = -103;

    Integer XSS_FILTER = -102;

    Integer TENANT_SECURITY_FILTER = -99;

    Integer ACTIVITY_FILTER = -98;

    Integer FLOWABLE_FILTER = -98;

    Integer DEMO_FILTER = Integer.MAX_VALUE;

}
