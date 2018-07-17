package com.yzx.codedemo.vo;

import com.fasterxml.jackson.annotation.JsonInclude;
import io.swagger.annotations.ApiModelProperty;

import java.util.List;

/**
 * 分页VO对象
 */
@JsonInclude(JsonInclude.Include.NON_NULL)
public class PageVO<T> {

    @ApiModelProperty("当前页码")
    private Integer currentPage = 1;
    @ApiModelProperty("每页记录数")
    private Integer pageSize = 10;
    @ApiModelProperty("总记录数")
    private Long totalCount;
    @ApiModelProperty("总页数")
    private Integer totalPage;
    @ApiModelProperty("列表数据")
    private List<T> items;

    public PageVO(Integer currentPage, Integer pageSize, Long totalCount, Integer totalPage, List<T> items) {
        this.currentPage = currentPage;
        this.pageSize = pageSize;
        this.totalCount = totalCount;
        this.totalPage = totalPage;
        this.items = items;
    }

    public Integer getCurrentPage() {
        return currentPage;
    }

    public void setCurrentPage(Integer currentPage) {
        this.currentPage = currentPage;
    }

    public Integer getPageSize() {
        return pageSize;
    }

    public void setPageSize(Integer pageSize) {
        this.pageSize = pageSize;
    }

    public Long getTotalCount() {
        return totalCount;
    }

    public void setTotalCount(Long totalCount) {
        this.totalCount = totalCount;
    }

    public Integer getTotalPage() {
        return totalPage;
    }

    public void setTotalPage(Integer totalPage) {
        this.totalPage = totalPage;
    }

    public List<T> getItems() {
        return items;
    }

    public void setItems(List<T> items) {
        this.items = items;
    }
}
