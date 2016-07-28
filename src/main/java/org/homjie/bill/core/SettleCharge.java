package org.homjie.bill.core;

/**
 * @Class SettleCharge
 * @Description 收费结算策略
 * @Author JieHong
 * @Date 2016年7月28日 下午2:46:14
 */
public enum SettleCharge {

	/**
	 * @Description 从有效级高的开始结算，Charge必须还清，将忽略明细项结算策略
	 */
	TOTAL,

	/**
	 * @Description 从有效级高的开始结算，单个收费必须还清，将忽略明细项结算策略
	 */
	SINGLE,

	/**
	 * @Description 从有效级高的开始结算，够还多少就还多少
	 */
	NONE,

	/**
	 * @Description 忽略优先级开始结算，单个收费必须还清，将忽略明细项结算策略
	 */
	SINGLE_IGNORE,

	/**
	 * @Description 忽略优先级开始结算，够还多少就还多少
	 */
	NONE_IGNORE;
}