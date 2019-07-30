package cn.bao.mybatis.pojo;

import java.util.List;

public class Orders {
    private String oid;
    private String orderTime;
    private String total;
    private String state;
    private User user;
    private String uid;
    private String address;
    private List<OrderItem> orderItem;
    public String getOid() {
        return oid;
    }

    public void setOid(String oid) {
        this.oid = oid;
    }

    public String getOrderTime() {
        return orderTime;
    }

    public void setOrderTime(String orderTime) {
        this.orderTime = orderTime;
    }

    public String getTotal() {
        return total;
    }

    public void setTotal(String total) {
        this.total = total;
    }

    public String getState() {
        return state;
    }

    public void setState(String state) {
        this.state = state;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public User getUser() {
        return user;
    }

    public void setUser(User user) {
        this.user = user;
    }

    public String getUid() {
        return uid;
    }

    public void setUid(String uid) {
        this.uid = uid;
    }

    @Override
    public String toString() {
        return "Orders{" +
                "oid='" + oid + '\'' +
                ", orderTime='" + orderTime + '\'' +
                ", total='" + total + '\'' +
                ", state='" + state + '\'' +
                ", user=" + user +
                ", uid='" + uid + '\'' +
                ", address='" + address + '\'' +
                '}';
    }

    public List<OrderItem> getOrderItem() {
        return orderItem;
    }

    public void setOrderItem(List<OrderItem> orderItems) {
        this.orderItem = orderItems;
    }
}
