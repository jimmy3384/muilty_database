package com.demo.database.po;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class UserLastVisitPoExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public UserLastVisitPoExample() {
        oredCriteria = new ArrayList<Criteria>();
    }

    public void setOrderByClause(String orderByClause) {
        this.orderByClause = orderByClause;
    }

    public String getOrderByClause() {
        return orderByClause;
    }

    public void setDistinct(boolean distinct) {
        this.distinct = distinct;
    }

    public boolean isDistinct() {
        return distinct;
    }

    public List<Criteria> getOredCriteria() {
        return oredCriteria;
    }

    public void or(Criteria criteria) {
        oredCriteria.add(criteria);
    }

    public Criteria or() {
        Criteria criteria = createCriteriaInternal();
        oredCriteria.add(criteria);
        return criteria;
    }

    public Criteria createCriteria() {
        Criteria criteria = createCriteriaInternal();
        if (oredCriteria.size() == 0) {
            oredCriteria.add(criteria);
        }
        return criteria;
    }

    protected Criteria createCriteriaInternal() {
        Criteria criteria = new Criteria();
        return criteria;
    }

    public void clear() {
        oredCriteria.clear();
        orderByClause = null;
        distinct = false;
    }

    protected abstract static class GeneratedCriteria {
        protected List<Criterion> criteria;

        protected GeneratedCriteria() {
            super();
            criteria = new ArrayList<Criterion>();
        }

        public boolean isValid() {
            return criteria.size() > 0;
        }

        public List<Criterion> getAllCriteria() {
            return criteria;
        }

        public List<Criterion> getCriteria() {
            return criteria;
        }

        protected void addCriterion(String condition) {
            if (condition == null) {
                throw new RuntimeException("Value for condition cannot be null");
            }
            criteria.add(new Criterion(condition));
        }

        protected void addCriterion(String condition, Object value, String property) {
            if (value == null) {
                throw new RuntimeException("Value for " + property + " cannot be null");
            }
            criteria.add(new Criterion(condition, value));
        }

        protected void addCriterion(String condition, Object value1, Object value2, String property) {
            if (value1 == null || value2 == null) {
                throw new RuntimeException("Between values for " + property + " cannot be null");
            }
            criteria.add(new Criterion(condition, value1, value2));
        }

        public Criteria andUserIdIsNull() {
            addCriterion("user_id is null");
            return (Criteria) this;
        }

        public Criteria andUserIdIsNotNull() {
            addCriterion("user_id is not null");
            return (Criteria) this;
        }

        public Criteria andUserIdEqualTo(Long value) {
            addCriterion("user_id =", value, "userId");
            return (Criteria) this;
        }

        public Criteria andUserIdNotEqualTo(Long value) {
            addCriterion("user_id <>", value, "userId");
            return (Criteria) this;
        }

        public Criteria andUserIdGreaterThan(Long value) {
            addCriterion("user_id >", value, "userId");
            return (Criteria) this;
        }

        public Criteria andUserIdGreaterThanOrEqualTo(Long value) {
            addCriterion("user_id >=", value, "userId");
            return (Criteria) this;
        }

        public Criteria andUserIdLessThan(Long value) {
            addCriterion("user_id <", value, "userId");
            return (Criteria) this;
        }

        public Criteria andUserIdLessThanOrEqualTo(Long value) {
            addCriterion("user_id <=", value, "userId");
            return (Criteria) this;
        }

        public Criteria andUserIdIn(List<Long> values) {
            addCriterion("user_id in", values, "userId");
            return (Criteria) this;
        }

        public Criteria andUserIdNotIn(List<Long> values) {
            addCriterion("user_id not in", values, "userId");
            return (Criteria) this;
        }

        public Criteria andUserIdBetween(Long value1, Long value2) {
            addCriterion("user_id between", value1, value2, "userId");
            return (Criteria) this;
        }

        public Criteria andUserIdNotBetween(Long value1, Long value2) {
            addCriterion("user_id not between", value1, value2, "userId");
            return (Criteria) this;
        }

        public Criteria andLastVisitTimeIsNull() {
            addCriterion("last_visit_time is null");
            return (Criteria) this;
        }

        public Criteria andLastVisitTimeIsNotNull() {
            addCriterion("last_visit_time is not null");
            return (Criteria) this;
        }

        public Criteria andLastVisitTimeEqualTo(Date value) {
            addCriterion("last_visit_time =", value, "lastVisitTime");
            return (Criteria) this;
        }

        public Criteria andLastVisitTimeNotEqualTo(Date value) {
            addCriterion("last_visit_time <>", value, "lastVisitTime");
            return (Criteria) this;
        }

        public Criteria andLastVisitTimeGreaterThan(Date value) {
            addCriterion("last_visit_time >", value, "lastVisitTime");
            return (Criteria) this;
        }

        public Criteria andLastVisitTimeGreaterThanOrEqualTo(Date value) {
            addCriterion("last_visit_time >=", value, "lastVisitTime");
            return (Criteria) this;
        }

        public Criteria andLastVisitTimeLessThan(Date value) {
            addCriterion("last_visit_time <", value, "lastVisitTime");
            return (Criteria) this;
        }

        public Criteria andLastVisitTimeLessThanOrEqualTo(Date value) {
            addCriterion("last_visit_time <=", value, "lastVisitTime");
            return (Criteria) this;
        }

        public Criteria andLastVisitTimeIn(List<Date> values) {
            addCriterion("last_visit_time in", values, "lastVisitTime");
            return (Criteria) this;
        }

        public Criteria andLastVisitTimeNotIn(List<Date> values) {
            addCriterion("last_visit_time not in", values, "lastVisitTime");
            return (Criteria) this;
        }

        public Criteria andLastVisitTimeBetween(Date value1, Date value2) {
            addCriterion("last_visit_time between", value1, value2, "lastVisitTime");
            return (Criteria) this;
        }

        public Criteria andLastVisitTimeNotBetween(Date value1, Date value2) {
            addCriterion("last_visit_time not between", value1, value2, "lastVisitTime");
            return (Criteria) this;
        }

        public Criteria andLastCityIsNull() {
            addCriterion("last_city is null");
            return (Criteria) this;
        }

        public Criteria andLastCityIsNotNull() {
            addCriterion("last_city is not null");
            return (Criteria) this;
        }

        public Criteria andLastCityEqualTo(String value) {
            addCriterion("last_city =", value, "lastCity");
            return (Criteria) this;
        }

        public Criteria andLastCityNotEqualTo(String value) {
            addCriterion("last_city <>", value, "lastCity");
            return (Criteria) this;
        }

        public Criteria andLastCityGreaterThan(String value) {
            addCriterion("last_city >", value, "lastCity");
            return (Criteria) this;
        }

        public Criteria andLastCityGreaterThanOrEqualTo(String value) {
            addCriterion("last_city >=", value, "lastCity");
            return (Criteria) this;
        }

        public Criteria andLastCityLessThan(String value) {
            addCriterion("last_city <", value, "lastCity");
            return (Criteria) this;
        }

        public Criteria andLastCityLessThanOrEqualTo(String value) {
            addCriterion("last_city <=", value, "lastCity");
            return (Criteria) this;
        }

        public Criteria andLastCityLike(String value) {
            addCriterion("last_city like", value, "lastCity");
            return (Criteria) this;
        }

        public Criteria andLastCityNotLike(String value) {
            addCriterion("last_city not like", value, "lastCity");
            return (Criteria) this;
        }

        public Criteria andLastCityIn(List<String> values) {
            addCriterion("last_city in", values, "lastCity");
            return (Criteria) this;
        }

        public Criteria andLastCityNotIn(List<String> values) {
            addCriterion("last_city not in", values, "lastCity");
            return (Criteria) this;
        }

        public Criteria andLastCityBetween(String value1, String value2) {
            addCriterion("last_city between", value1, value2, "lastCity");
            return (Criteria) this;
        }

        public Criteria andLastCityNotBetween(String value1, String value2) {
            addCriterion("last_city not between", value1, value2, "lastCity");
            return (Criteria) this;
        }

        public Criteria andLastCityCodeIsNull() {
            addCriterion("last_city_code is null");
            return (Criteria) this;
        }

        public Criteria andLastCityCodeIsNotNull() {
            addCriterion("last_city_code is not null");
            return (Criteria) this;
        }

        public Criteria andLastCityCodeEqualTo(Integer value) {
            addCriterion("last_city_code =", value, "lastCityCode");
            return (Criteria) this;
        }

        public Criteria andLastCityCodeNotEqualTo(Integer value) {
            addCriterion("last_city_code <>", value, "lastCityCode");
            return (Criteria) this;
        }

        public Criteria andLastCityCodeGreaterThan(Integer value) {
            addCriterion("last_city_code >", value, "lastCityCode");
            return (Criteria) this;
        }

        public Criteria andLastCityCodeGreaterThanOrEqualTo(Integer value) {
            addCriterion("last_city_code >=", value, "lastCityCode");
            return (Criteria) this;
        }

        public Criteria andLastCityCodeLessThan(Integer value) {
            addCriterion("last_city_code <", value, "lastCityCode");
            return (Criteria) this;
        }

        public Criteria andLastCityCodeLessThanOrEqualTo(Integer value) {
            addCriterion("last_city_code <=", value, "lastCityCode");
            return (Criteria) this;
        }

        public Criteria andLastCityCodeIn(List<Integer> values) {
            addCriterion("last_city_code in", values, "lastCityCode");
            return (Criteria) this;
        }

        public Criteria andLastCityCodeNotIn(List<Integer> values) {
            addCriterion("last_city_code not in", values, "lastCityCode");
            return (Criteria) this;
        }

        public Criteria andLastCityCodeBetween(Integer value1, Integer value2) {
            addCriterion("last_city_code between", value1, value2, "lastCityCode");
            return (Criteria) this;
        }

        public Criteria andLastCityCodeNotBetween(Integer value1, Integer value2) {
            addCriterion("last_city_code not between", value1, value2, "lastCityCode");
            return (Criteria) this;
        }

        public Criteria andLastIpIsNull() {
            addCriterion("last_ip is null");
            return (Criteria) this;
        }

        public Criteria andLastIpIsNotNull() {
            addCriterion("last_ip is not null");
            return (Criteria) this;
        }

        public Criteria andLastIpEqualTo(String value) {
            addCriterion("last_ip =", value, "lastIp");
            return (Criteria) this;
        }

        public Criteria andLastIpNotEqualTo(String value) {
            addCriterion("last_ip <>", value, "lastIp");
            return (Criteria) this;
        }

        public Criteria andLastIpGreaterThan(String value) {
            addCriterion("last_ip >", value, "lastIp");
            return (Criteria) this;
        }

        public Criteria andLastIpGreaterThanOrEqualTo(String value) {
            addCriterion("last_ip >=", value, "lastIp");
            return (Criteria) this;
        }

        public Criteria andLastIpLessThan(String value) {
            addCriterion("last_ip <", value, "lastIp");
            return (Criteria) this;
        }

        public Criteria andLastIpLessThanOrEqualTo(String value) {
            addCriterion("last_ip <=", value, "lastIp");
            return (Criteria) this;
        }

        public Criteria andLastIpLike(String value) {
            addCriterion("last_ip like", value, "lastIp");
            return (Criteria) this;
        }

        public Criteria andLastIpNotLike(String value) {
            addCriterion("last_ip not like", value, "lastIp");
            return (Criteria) this;
        }

        public Criteria andLastIpIn(List<String> values) {
            addCriterion("last_ip in", values, "lastIp");
            return (Criteria) this;
        }

        public Criteria andLastIpNotIn(List<String> values) {
            addCriterion("last_ip not in", values, "lastIp");
            return (Criteria) this;
        }

        public Criteria andLastIpBetween(String value1, String value2) {
            addCriterion("last_ip between", value1, value2, "lastIp");
            return (Criteria) this;
        }

        public Criteria andLastIpNotBetween(String value1, String value2) {
            addCriterion("last_ip not between", value1, value2, "lastIp");
            return (Criteria) this;
        }

        public Criteria andDeviceTypeIsNull() {
            addCriterion("device_type is null");
            return (Criteria) this;
        }

        public Criteria andDeviceTypeIsNotNull() {
            addCriterion("device_type is not null");
            return (Criteria) this;
        }

        public Criteria andDeviceTypeEqualTo(String value) {
            addCriterion("device_type =", value, "deviceType");
            return (Criteria) this;
        }

        public Criteria andDeviceTypeNotEqualTo(String value) {
            addCriterion("device_type <>", value, "deviceType");
            return (Criteria) this;
        }

        public Criteria andDeviceTypeGreaterThan(String value) {
            addCriterion("device_type >", value, "deviceType");
            return (Criteria) this;
        }

        public Criteria andDeviceTypeGreaterThanOrEqualTo(String value) {
            addCriterion("device_type >=", value, "deviceType");
            return (Criteria) this;
        }

        public Criteria andDeviceTypeLessThan(String value) {
            addCriterion("device_type <", value, "deviceType");
            return (Criteria) this;
        }

        public Criteria andDeviceTypeLessThanOrEqualTo(String value) {
            addCriterion("device_type <=", value, "deviceType");
            return (Criteria) this;
        }

        public Criteria andDeviceTypeLike(String value) {
            addCriterion("device_type like", value, "deviceType");
            return (Criteria) this;
        }

        public Criteria andDeviceTypeNotLike(String value) {
            addCriterion("device_type not like", value, "deviceType");
            return (Criteria) this;
        }

        public Criteria andDeviceTypeIn(List<String> values) {
            addCriterion("device_type in", values, "deviceType");
            return (Criteria) this;
        }

        public Criteria andDeviceTypeNotIn(List<String> values) {
            addCriterion("device_type not in", values, "deviceType");
            return (Criteria) this;
        }

        public Criteria andDeviceTypeBetween(String value1, String value2) {
            addCriterion("device_type between", value1, value2, "deviceType");
            return (Criteria) this;
        }

        public Criteria andDeviceTypeNotBetween(String value1, String value2) {
            addCriterion("device_type not between", value1, value2, "deviceType");
            return (Criteria) this;
        }

        public Criteria andAppVersionIsNull() {
            addCriterion("app_version is null");
            return (Criteria) this;
        }

        public Criteria andAppVersionIsNotNull() {
            addCriterion("app_version is not null");
            return (Criteria) this;
        }

        public Criteria andAppVersionEqualTo(String value) {
            addCriterion("app_version =", value, "appVersion");
            return (Criteria) this;
        }

        public Criteria andAppVersionNotEqualTo(String value) {
            addCriterion("app_version <>", value, "appVersion");
            return (Criteria) this;
        }

        public Criteria andAppVersionGreaterThan(String value) {
            addCriterion("app_version >", value, "appVersion");
            return (Criteria) this;
        }

        public Criteria andAppVersionGreaterThanOrEqualTo(String value) {
            addCriterion("app_version >=", value, "appVersion");
            return (Criteria) this;
        }

        public Criteria andAppVersionLessThan(String value) {
            addCriterion("app_version <", value, "appVersion");
            return (Criteria) this;
        }

        public Criteria andAppVersionLessThanOrEqualTo(String value) {
            addCriterion("app_version <=", value, "appVersion");
            return (Criteria) this;
        }

        public Criteria andAppVersionLike(String value) {
            addCriterion("app_version like", value, "appVersion");
            return (Criteria) this;
        }

        public Criteria andAppVersionNotLike(String value) {
            addCriterion("app_version not like", value, "appVersion");
            return (Criteria) this;
        }

        public Criteria andAppVersionIn(List<String> values) {
            addCriterion("app_version in", values, "appVersion");
            return (Criteria) this;
        }

        public Criteria andAppVersionNotIn(List<String> values) {
            addCriterion("app_version not in", values, "appVersion");
            return (Criteria) this;
        }

        public Criteria andAppVersionBetween(String value1, String value2) {
            addCriterion("app_version between", value1, value2, "appVersion");
            return (Criteria) this;
        }

        public Criteria andAppVersionNotBetween(String value1, String value2) {
            addCriterion("app_version not between", value1, value2, "appVersion");
            return (Criteria) this;
        }

        public Criteria andOrgAgentIsNull() {
            addCriterion("org_agent is null");
            return (Criteria) this;
        }

        public Criteria andOrgAgentIsNotNull() {
            addCriterion("org_agent is not null");
            return (Criteria) this;
        }

        public Criteria andOrgAgentEqualTo(String value) {
            addCriterion("org_agent =", value, "orgAgent");
            return (Criteria) this;
        }

        public Criteria andOrgAgentNotEqualTo(String value) {
            addCriterion("org_agent <>", value, "orgAgent");
            return (Criteria) this;
        }

        public Criteria andOrgAgentGreaterThan(String value) {
            addCriterion("org_agent >", value, "orgAgent");
            return (Criteria) this;
        }

        public Criteria andOrgAgentGreaterThanOrEqualTo(String value) {
            addCriterion("org_agent >=", value, "orgAgent");
            return (Criteria) this;
        }

        public Criteria andOrgAgentLessThan(String value) {
            addCriterion("org_agent <", value, "orgAgent");
            return (Criteria) this;
        }

        public Criteria andOrgAgentLessThanOrEqualTo(String value) {
            addCriterion("org_agent <=", value, "orgAgent");
            return (Criteria) this;
        }

        public Criteria andOrgAgentLike(String value) {
            addCriterion("org_agent like", value, "orgAgent");
            return (Criteria) this;
        }

        public Criteria andOrgAgentNotLike(String value) {
            addCriterion("org_agent not like", value, "orgAgent");
            return (Criteria) this;
        }

        public Criteria andOrgAgentIn(List<String> values) {
            addCriterion("org_agent in", values, "orgAgent");
            return (Criteria) this;
        }

        public Criteria andOrgAgentNotIn(List<String> values) {
            addCriterion("org_agent not in", values, "orgAgent");
            return (Criteria) this;
        }

        public Criteria andOrgAgentBetween(String value1, String value2) {
            addCriterion("org_agent between", value1, value2, "orgAgent");
            return (Criteria) this;
        }

        public Criteria andOrgAgentNotBetween(String value1, String value2) {
            addCriterion("org_agent not between", value1, value2, "orgAgent");
            return (Criteria) this;
        }

        public Criteria andLastCityLikeInsensitive(String value) {
            addCriterion("upper(last_city) like", value.toUpperCase(), "lastCity");
            return (Criteria) this;
        }

        public Criteria andLastIpLikeInsensitive(String value) {
            addCriterion("upper(last_ip) like", value.toUpperCase(), "lastIp");
            return (Criteria) this;
        }

        public Criteria andDeviceTypeLikeInsensitive(String value) {
            addCriterion("upper(device_type) like", value.toUpperCase(), "deviceType");
            return (Criteria) this;
        }

        public Criteria andAppVersionLikeInsensitive(String value) {
            addCriterion("upper(app_version) like", value.toUpperCase(), "appVersion");
            return (Criteria) this;
        }

        public Criteria andOrgAgentLikeInsensitive(String value) {
            addCriterion("upper(org_agent) like", value.toUpperCase(), "orgAgent");
            return (Criteria) this;
        }
    }

    public static class Criteria extends GeneratedCriteria {

        protected Criteria() {
            super();
        }
    }

    public static class Criterion {
        private String condition;

        private Object value;

        private Object secondValue;

        private boolean noValue;

        private boolean singleValue;

        private boolean betweenValue;

        private boolean listValue;

        private String typeHandler;

        public String getCondition() {
            return condition;
        }

        public Object getValue() {
            return value;
        }

        public Object getSecondValue() {
            return secondValue;
        }

        public boolean isNoValue() {
            return noValue;
        }

        public boolean isSingleValue() {
            return singleValue;
        }

        public boolean isBetweenValue() {
            return betweenValue;
        }

        public boolean isListValue() {
            return listValue;
        }

        public String getTypeHandler() {
            return typeHandler;
        }

        protected Criterion(String condition) {
            super();
            this.condition = condition;
            this.typeHandler = null;
            this.noValue = true;
        }

        protected Criterion(String condition, Object value, String typeHandler) {
            super();
            this.condition = condition;
            this.value = value;
            this.typeHandler = typeHandler;
            if (value instanceof List<?>) {
                this.listValue = true;
            } else {
                this.singleValue = true;
            }
        }

        protected Criterion(String condition, Object value) {
            this(condition, value, null);
        }

        protected Criterion(String condition, Object value, Object secondValue, String typeHandler) {
            super();
            this.condition = condition;
            this.value = value;
            this.secondValue = secondValue;
            this.typeHandler = typeHandler;
            this.betweenValue = true;
        }

        protected Criterion(String condition, Object value, Object secondValue) {
            this(condition, value, secondValue, null);
        }
    }
}