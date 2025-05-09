package com.alipay.mobile.common.transport.http.selfencrypt;

import android.text.TextUtils;
import com.alipay.mobile.common.transport.config.TransportConfigureItem;
import com.alipay.mobile.common.transport.config.TransportConfigureManager;
import com.alipay.mobile.common.transport.http.HttpUrlRequest;
import com.alipay.mobile.common.transport.utils.LogCatUtil;
import com.alipay.mobile.common.transport.utils.MiscUtils;
import com.alipay.mobile.common.transport.utils.MpaasNetConfigUtil;
import com.alipay.mobile.common.transport.utils.TransportEnvUtil;
import com.android.alibaba.ip.runtime.IpChange;
import org.apache.http.entity.AbstractHttpEntity;
import org.apache.http.entity.ByteArrayEntity;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes3.dex */
public class SelfEncryptUtils {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    public static byte[] getDecryptedContent(byte[] bArr, ClientRpcPack clientRpcPack) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (byte[]) ipChange.ipc$dispatch("575e4657", new Object[]{bArr, clientRpcPack});
        }
        LogCatUtil.debug("SelfEncryptUtils", "start decrypted...");
        try {
            if (!isNeedSelfEncrypt()) {
                return bArr;
            }
            byte[] decrypt = clientRpcPack.decrypt(bArr);
            LogCatUtil.debug("SelfEncryptUtils", "after decrypted,len: " + decrypt.length);
            return decrypt;
        } catch (Exception e) {
            LogCatUtil.error("SelfEncryptUtils", "getDecryptedContent ex:" + e.toString());
            throw e;
        }
    }

    public static AbstractHttpEntity getEncryptedEntity(byte[] bArr, ClientRpcPack clientRpcPack, HttpUrlRequest httpUrlRequest) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (AbstractHttpEntity) ipChange.ipc$dispatch("253b275", new Object[]{bArr, clientRpcPack, httpUrlRequest});
        }
        LogCatUtil.debug("SelfEncryptUtils", "start encrypted...");
        try {
            if (!isNeedSelfEncrypt()) {
                return new ByteArrayEntity(bArr);
            }
            byte[] encrypt = clientRpcPack.encrypt(bArr);
            httpUrlRequest.setReqData(encrypt);
            ByteArrayEntity byteArrayEntity = new ByteArrayEntity(encrypt);
            LogCatUtil.debug("SelfEncryptUtils", "after encrypted,len: " + encrypt.length);
            return byteArrayEntity;
        } catch (Exception e) {
            LogCatUtil.error("SelfEncryptUtils", "getEncryptedEntity ex:" + e.toString());
            throw e;
        }
    }

    public static boolean isDefaultGlobalCrypt() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("93baf3df", new Object[0])).booleanValue();
        }
        return MpaasNetConfigUtil.isDefaultGlobalCrypt(TransportEnvUtil.getContext());
    }

    public static boolean isInGwWhiteList(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("92096a7d", new Object[]{str})).booleanValue();
        }
        if (MiscUtils.isDebugger(TransportEnvUtil.getContext())) {
            return true;
        }
        return MpaasNetConfigUtil.getGWWhiteList(TransportEnvUtil.getContext()).contains(str);
    }

    public static boolean isNeedSelfEncrypt() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("c6f28484", new Object[0])).booleanValue();
        }
        return MpaasNetConfigUtil.isCrypt(TransportEnvUtil.getContext());
    }

    public static boolean isRpcEncryptSwitchOn() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("12385de8", new Object[0])).booleanValue();
        }
        if (TextUtils.equals(TransportConfigureManager.getInstance().getStringValue(TransportConfigureItem.RPC_SELF_ENCTYPT), "T")) {
            return true;
        }
        return false;
    }
}
