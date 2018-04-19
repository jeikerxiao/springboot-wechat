package com.jeiker.wechat.util.digest;

import lombok.extern.slf4j.Slf4j;

import java.security.MessageDigest;
import java.security.NoSuchAlgorithmException;

@Slf4j
public class EncryptUtil {

    /**
     * 将字符串进行sha1加密
     *
     * @param str 需要加密的字符串
     * @return    加密后的内容
     */
    public static String sha1(String str) {
        try {
            MessageDigest digest = MessageDigest.getInstance("SHA-1");
            digest.update(str.getBytes());
            byte messageDigest[] = digest.digest();
            // 创建 16进制字符串
            StringBuffer hexString = new StringBuffer();
            // 字节数组转换为 十六进制 数
            for (int i = 0; i < messageDigest.length; i++) {
                String shaHex = Integer.toHexString(messageDigest[i] & 0xFF);
                if (shaHex.length() < 2) {
                    hexString.append(0);
                }
                hexString.append(shaHex);
            }
            return hexString.toString();

        } catch (NoSuchAlgorithmException e) {
            e.printStackTrace();
            log.error("【加密错误】- {}", e);
        }
        return "";
    }
}
