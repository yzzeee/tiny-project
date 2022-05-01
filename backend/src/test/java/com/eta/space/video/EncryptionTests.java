package com.eta.space.video;

import org.bouncycastle.jce.provider.BouncyCastleProvider;
import org.jasypt.encryption.pbe.PooledPBEStringEncryptor;
import org.junit.jupiter.api.Test;

public class EncryptionTests {

    @Test
    void encryptionTest() {
        PooledPBEStringEncryptor encryptor = new PooledPBEStringEncryptor();
        encryptor.setProvider(new BouncyCastleProvider());
        encryptor.setPoolSize(4);
        encryptor.setPassword("eta"); // 암호화에 사용할 패스워드
        encryptor.setAlgorithm("PBEWithSHA256And256BitAES-CBC-BC");

        String plainText1 = "happy"; // 암호화 할 내용
        String encryptedText1 = encryptor.encrypt(plainText1); // 암호화
        String decryptedText1 = encryptor.decrypt(encryptedText1); // 복호화
        System.out.println("Enc:" + encryptedText1 + ", Dec:" + decryptedText1);

        String plainText2 = "123";
        String encryptedText2 = encryptor.encrypt(plainText2);
        String decryptedText2 = encryptor.decrypt(encryptedText2);
        System.out.println("Enc:" + encryptedText2 + ", Dec:" + decryptedText2);
    }

}