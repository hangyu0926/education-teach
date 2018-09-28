package cn.teach.core.common;

import com.fasterxml.jackson.databind.ObjectMapper;
import com.fasterxml.jackson.datatype.hibernate4.Hibernate4Module;

/**
 *
 */
public class HibernateAwareObjectMapper extends ObjectMapper {

    /**
     * 序列化
     */
    private static final long serialVersionUID = -7073564922657772376L;

    /**
     * 使用父类方法改写构造
     */
    public HibernateAwareObjectMapper() {
        registerModule(new Hibernate4Module());
    }

}
