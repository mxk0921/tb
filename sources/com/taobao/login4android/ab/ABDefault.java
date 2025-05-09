package com.taobao.login4android.ab;

import android.text.TextUtils;
import anet.channel.util.ErrorConstant;
import com.ali.user.mobile.info.AppInfo;
import com.alibaba.fastjson.JSON;
import com.alibaba.security.realidentity.ui.view.ALBiometricsActivityParentView;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.login4android.log.LoginTLogAdapter;
import com.taobao.login4android.utils.LoginSwitch;
import java.nio.charset.StandardCharsets;
import java.util.List;
import tb.t2o;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes7.dex */
public class ABDefault {
    public static volatile transient /* synthetic */ IpChange $ipChange = null;
    private static final String DEFAULT_CONFIG_LINE_DISPLAY = "{\"algorithm\":\"Murmur32\",\"testKey\":\"lineDisplay\",\"buckets\":[{\"bucketValue\":1,\"rate\":0,\"whiteList\":[\"WxknTE1mGKEDAF6Y8q35WyVG\"]},{\"bucketValue\":2,\"rate\":1000000,\"whiteList\":[]}],\"emptyBucket\":{\"bucketValue\":0,\"rate\":0}}";
    private static final String DEFAULT_CONFIG_OPPO_FINGER = "{\"algorithm\":\"Murmur32\",\"testKey\":\"oppoFinger\",\"buckets\":[{\"bucketValue\":1,\"rate\":100000},{\"bucketValue\":2,\"rate\":1000000,\"whiteList\":[\"Yljip5b6lIsDAP4PNSTWpMN2\",\"XgtwuV0F8coDAJlg9a+gpxF4\"]}],\"emptyBucket\":{\"bucketValue\":0,\"rate\":100000}}";
    private static final String DEFAULT_CONFIG_REINSTALL_LOGIN = "{\"algorithm\":\"Murmur32\",\"testKey\":\"reinstallLogin\",\"buckets\":[{\"bucketValue\":1,\"rate\":100000},{\"bucketValue\":2,\"rate\":1000000,\"whiteList\":[\"Yljip5b6lIsDAP4PNSTWpMN2\",\"XgtwuV0F8coDAJlg9a+gpxF4\"]}],\"emptyBucket\":{\"bucketValue\":0,\"rate\":100000}}";
    private static final String DEFAULT_CONFIG_RESTORE_SESSION = "{\"algorithm\":\"Murmur32\",\"testKey\":\"session\",\"buckets\":[{\"bucketValue\":1,\"rate\":0},{\"bucketValue\":2,\"rate\":1000000,\"whiteList\":[\"Yljip5b6lIsDAP4PNSTWpMN2\",\"XgtwuV0F8coDAJlg9a+gpxF4\"]}],\"emptyBucket\":{\"bucketValue\":0,\"rate\":100000}}";
    private static final String TAG = "login.ABDefault";

    static {
        t2o.a(517996566);
    }

    public static AbtestBucket getBucket(String str, String str2, AbtestExpDo abtestExpDo) {
        List<String> list;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (AbtestBucket) ipChange.ipc$dispatch("68cac0b7", new Object[]{str, str2, abtestExpDo});
        }
        List<AbtestBucket> list2 = abtestExpDo.buckets;
        AbtestBucket abtestBucket = abtestExpDo.emptyBucket;
        if (!(abtestBucket == null || (list = abtestBucket.whiteList) == null || !list.contains(str))) {
            return abtestBucket;
        }
        for (AbtestBucket abtestBucket2 : list2) {
            List<String> list3 = abtestBucket2.whiteList;
            if (list3 != null && list3.contains(str)) {
                return abtestBucket2;
            }
        }
        int hashCode = getHashCode(str, str2, false, abtestExpDo);
        if (abtestBucket != null && isInGray(hashCode, abtestBucket)) {
            return abtestBucket;
        }
        int hashCode2 = getHashCode(str, str2, abtestExpDo.needRandomFactor, abtestExpDo);
        for (AbtestBucket abtestBucket3 : list2) {
            if (isInGray(hashCode2, abtestBucket3)) {
                return abtestBucket3;
            }
        }
        return null;
    }

    public static int getBucketValue(String str, String str2, AbtestExpDo abtestExpDo) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("6dfdbb83", new Object[]{str, str2, abtestExpDo})).intValue();
        }
        AbtestBucket bucket = getBucket(str, str2, abtestExpDo);
        if (bucket == null) {
            return 0;
        }
        return bucket.bucketValue;
    }

    private static String getDefaultConfig(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("13353862", new Object[]{str});
        }
        if ("restoreSession".equals(str)) {
            return DEFAULT_CONFIG_RESTORE_SESSION;
        }
        if ("oppo_finger".equals(str) || ALBiometricsActivityParentView.p.equals(str)) {
            return DEFAULT_CONFIG_OPPO_FINGER;
        }
        if ("reinstall_login".equals(str) || "blo".equals(str)) {
            return DEFAULT_CONFIG_REINSTALL_LOGIN;
        }
        if ("line_display".equals(str)) {
            return DEFAULT_CONFIG_LINE_DISPLAY;
        }
        return DEFAULT_CONFIG_RESTORE_SESSION;
    }

    public static int getValue(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("b2cd23ff", new Object[]{str})).intValue();
        }
        String config = LoginSwitch.getConfig(str, getDefaultConfig(str));
        LoginTLogAdapter.trace(TAG, "getValue() called with: key = [" + str + "],config=" + config);
        return getValue(str, config, AppInfo.getInstance().getUtdid());
    }

    private static boolean isInGray(int i, AbtestBucket abtestBucket) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("af7dbdf0", new Object[]{new Integer(i), abtestBucket})).booleanValue();
        }
        return isNum100WPub(i, abtestBucket.rate);
    }

    public static boolean isNum100WPub(long j, int i) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("3bcae665", new Object[]{new Long(j), new Integer(i)})).booleanValue();
        }
        if (j < 0) {
            j = Math.abs(j);
        }
        if (j % 1000000 < i) {
            return true;
        }
        return false;
    }

    private static int getHashCode(String str, String str2, boolean z, AbtestExpDo abtestExpDo) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("d7c086e7", new Object[]{str, str2, new Boolean(z), abtestExpDo})).intValue();
        }
        LoginTLogAdapter.trace(TAG, "getHashCode() called with: utdid = [" + str + "], testKey = [" + str2 + "], needRandom = [" + z + "], expDo = [" + abtestExpDo + "]");
        if (z) {
            if (!TextUtils.isEmpty(abtestExpDo.testKey)) {
                str2 = abtestExpDo.testKey;
            }
            if (str.length() > 16) {
                str = str.substring(16) + str2 + str.substring(8, 16) + str.substring(0, 8);
            } else {
                str = str + str2;
            }
        }
        if (!AbtestExpDo.MURMUR32.equals(abtestExpDo.algorithm)) {
            return Math.abs(str.hashCode());
        }
        byte[] bytes = str.getBytes(StandardCharsets.UTF_8);
        return Math.abs(MurmurHash3.hash32(bytes, 0, bytes.length, 0));
    }

    public static int getValue(String str, String str2, String str3) {
        List<AbtestBucket> list;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("e64c4313", new Object[]{str, str2, str3})).intValue();
        }
        if (TextUtils.isEmpty(str)) {
            return 0;
        }
        if (TextUtils.isEmpty(str2)) {
            return ErrorConstant.ERROR_IO_EXCEPTION;
        }
        try {
            AbtestExpDo abtestExpDo = (AbtestExpDo) JSON.parseObject(str2, AbtestExpDo.class);
            if (!(abtestExpDo == null || (list = abtestExpDo.buckets) == null)) {
                if (!list.isEmpty()) {
                    return getBucketValue(str3, str, abtestExpDo);
                }
            }
            return 0;
        } catch (Exception e) {
            LoginTLogAdapter.e(TAG, "ab parse json error", e);
            e.printStackTrace();
            return 0;
        }
    }
}
