package com.example.litemall.service;

import com.example.litemall.model.po.FreightModel;
import java.util.List;

/**
 * (FreightModel)表服务接口
 *
 * @author makejava
 * @since 2020-12-03 11:25:26
 */
public interface FreightModelService {

    /**
     * 通过ID查询单条数据
     *
     * @param id 主键
     * @return 实例对象
     */
    FreightModel queryById(Long id);

    /**
     * 查询多条数据
     *
     * @param offset 查询起始位置
     * @param limit 查询条数
     * @return 对象列表
     */
    List<FreightModel> queryAllByLimit(int offset, int limit);

    /**
     * 新增数据
     *
     * @param freightModel 实例对象
     * @return 实例对象
     */
    FreightModel insert(FreightModel freightModel);

    /**
     * 修改数据
     *
     * @param freightModel 实例对象
     * @return 实例对象
     */
    FreightModel update(FreightModel freightModel);

    /**
     * 通过主键删除数据
     *
     * @param id 主键
     * @return 是否成功
     */
    boolean deleteById(Long id);

}