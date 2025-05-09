package com.alipay.android.app.safepaybase.alikeyboard;

import com.alipay.android.app.safepaylog.utils.LogUtils;
import com.alipay.mobile.framework.MpaasClassInfo;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.umipublish.draft.DraftMediaHelper;
import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;

/* compiled from: Taobao */
@MpaasClassInfo(ExportJarName = "unknown", Level = DraftMediaHelper.DraftType.PRODUCT, Product = ":android-phone-wallet-safepaybase")
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes3.dex */
public class KeyboardManager {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    /* renamed from: a  reason: collision with root package name */
    public static final Map<Integer, AlipayKeyboard> f3490a = new ConcurrentHashMap();

    public static void bindKeyboard(int i, AlipayKeyboard alipayKeyboard) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("f505a886", new Object[]{new Integer(i), alipayKeyboard});
        } else if (alipayKeyboard != null) {
            LogUtils.record(2, "KeyboardManager::bindKeyboard", "KeyboardManager-bindKeyboard:" + i);
            ((ConcurrentHashMap) f3490a).put(Integer.valueOf(i), alipayKeyboard);
        }
    }

    public static AlipayKeyboard getKeyboard(int i) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (AlipayKeyboard) ipChange.ipc$dispatch("f757f4ed", new Object[]{new Integer(i)});
        }
        LogUtils.record(2, "KeyboardManager::getKeyboard", "KeyboardManager-getKeyboard:" + i);
        Map<Integer, AlipayKeyboard> map = f3490a;
        if (((ConcurrentHashMap) map).containsKey(Integer.valueOf(i))) {
            return (AlipayKeyboard) ((ConcurrentHashMap) map).get(Integer.valueOf(i));
        }
        return null;
    }

    public static boolean isBindKeyboard(int i) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("7f67e692", new Object[]{new Integer(i)})).booleanValue();
        }
        if (getKeyboard(i) != null) {
            return true;
        }
        return false;
    }

    public static void unBindKeyboard(int i) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("4c8b10ff", new Object[]{new Integer(i)});
            return;
        }
        LogUtils.record(2, "KeyboardManager::unBindKeyboard", "KeyboardManager-unBindKeyboard:" + i);
        Map<Integer, AlipayKeyboard> map = f3490a;
        if (((ConcurrentHashMap) map).containsKey(Integer.valueOf(i))) {
            ((ConcurrentHashMap) map).remove(Integer.valueOf(i));
        }
    }
}
