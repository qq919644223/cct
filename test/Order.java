package test;
/**
 * 练习3
 * 订单类
 * chenchaotao
 * 2020-03-04 17:20
 */
public class Order {
    /**
     * 订单编号
     */
    private String orderItemId;

    /**
     * 付款方ID
     */
    private Integer paySideId;
    /**
     * 支付方式ID
     */
    private Integer payModeId;
    /**
     * 订单状态
     */
    private int order_type;
    /**
     * 寄件联系人
     */
    private String sendLinkMan;
    /**
     * 寄件手机
     */
    private String sendPhoneSms;
    /**
     * 寄件地址
     */
    private String sendAddress;
    /**
     * 收件联系人
     */
    private String dispatchLinkMan;
    /**
     * 收件手机
     */
    private String dispatchPhoneSms;
    /**
     * 收件地址
     */
    private String dispatchAddress;
    /**
     * 创建时间
     */
    private String creationTime;
    /**
     * 付款时间
     */
    private String paymentTime;
    /**
     * 发货时间
     */
    private String deliveryTime;
    /**
     * 成交时间
     */
    private String closingTime;
    /**
     * 订单总价
     */
    private String Price;

}

