package com.uc.webview.export.extension;

import com.uc.webview.base.KeyIdMap;
import java.util.ArrayList;
import java.util.List;
import java.util.Set;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes9.dex */
public class GlobalSettings extends com.uc.webview.base.GlobalSettings {
    static final /* synthetic */ boolean $assertionsDisabled = false;
    @Deprecated
    public static final int BUSINESS_INFO_TYPE_ACCESSIBLE_LIST = 1;
    @Deprecated
    public static final int BUSINESS_INFO_TYPE_CDPARAM = 2;
    public static final int SETTINGS_TYPE_BOOL = 0;
    public static final int SETTINGS_TYPE_FLOAT = 2;
    public static final int SETTINGS_TYPE_INT = 1;
    private static final int SETTINGS_TYPE_LIST = 4;
    public static final int SETTINGS_TYPE_STRING = 3;
    private static final GlobalSettings sInstance = new GlobalSettings();

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes9.dex */
    public static class a {

        /* renamed from: a  reason: collision with root package name */
        static final int[][] f14310a;

        static {
            int[][] iArr = KeyIdMap.c;
            int[] iArr2 = iArr[0];
            int[] iArr3 = {iArr2[0], iArr2[1]};
            int[] iArr4 = iArr[1];
            int[] iArr5 = iArr[2];
            int i = iArr[3][0];
            int[] iArr6 = iArr[4];
            int i2 = iArr6[1];
            f14310a = new int[][]{iArr3, new int[]{iArr4[0], iArr4[1]}, new int[]{iArr5[0], iArr5[1]}, new int[]{i, i2}, new int[]{iArr6[0], i2}};
        }
    }

    public static boolean containsKey(String str) {
        return KeyIdMap.getId(str) >= 0;
    }

    public static String get(String str, String str2) {
        return com.uc.webview.base.GlobalSettings.get(KeyIdMap.getId(str), str2);
    }

    public static boolean getBoolValue(String str) {
        return com.uc.webview.base.GlobalSettings.getBoolValue(KeyIdMap.getId(str));
    }

    public static List<String> getCoreCareSettingKeys(int i) {
        int[] iArr = a.f14310a[i];
        int i2 = iArr[1];
        ArrayList arrayList = new ArrayList();
        for (int i3 = iArr[0]; i3 < i2; i3++) {
            arrayList.add(KeyIdMap.f14251a[i3]);
        }
        return arrayList;
    }

    public static float getFloatValue(String str) {
        return com.uc.webview.base.GlobalSettings.getFloatValue(KeyIdMap.getId(str));
    }

    public static String[] getInitKeyList() {
        return KeyIdMap.b;
    }

    public static int getIntValue(String str) {
        return com.uc.webview.base.GlobalSettings.getIntValue(KeyIdMap.getId(str));
    }

    public static String getStringValue(String str) {
        return com.uc.webview.base.GlobalSettings.getStringValue(KeyIdMap.getId(str));
    }

    public static boolean isAccessible(String str, String str2) {
        return com.uc.webview.base.GlobalSettings.isAccessible(KeyIdMap.getId(str), str2);
    }

    public static boolean isRunningInWebViewSdk() {
        return getBoolValue(SettingKeys.IsRunningInWebViewSdk);
    }

    public static Set<String> keySet() {
        return KeyIdMap.a();
    }

    public static GlobalSettings set(String str, boolean z) {
        com.uc.webview.base.GlobalSettings.set(KeyIdMap.getId(str), z);
        return sInstance;
    }

    @Deprecated
    public static void setBoolValue(String str, boolean z) {
        com.uc.webview.base.GlobalSettings.set(KeyIdMap.getId(str), z);
    }

    @Deprecated
    public static void setFloatValue(String str, float f) {
        com.uc.webview.base.GlobalSettings.set(KeyIdMap.getId(str), f);
    }

    @Deprecated
    public static void setIntValue(String str, int i) {
        com.uc.webview.base.GlobalSettings.set(KeyIdMap.getId(str), i);
    }

    @Deprecated
    public static void setStringValue(String str, String str2) {
        com.uc.webview.base.GlobalSettings.set(KeyIdMap.getId(str), str2);
    }

    public static void setValue(String str, String str2) {
        com.uc.webview.base.GlobalSettings.setValue(KeyIdMap.getId(str), str2);
    }

    public static boolean containsKey(int i, String str) {
        int[] iArr = a.f14310a[i];
        int id = KeyIdMap.getId(str);
        return id >= iArr[0] && id < iArr[1];
    }

    public static void setValue(String str, String[] strArr) {
        com.uc.webview.base.GlobalSettings.setValue(KeyIdMap.getId(str), strArr);
    }

    public static GlobalSettings set(String str, int i) {
        com.uc.webview.base.GlobalSettings.set(KeyIdMap.getId(str), i);
        return sInstance;
    }

    public static GlobalSettings set(String str, float f) {
        com.uc.webview.base.GlobalSettings.set(KeyIdMap.getId(str), f);
        return sInstance;
    }

    public static GlobalSettings set(String str, String str2) {
        com.uc.webview.base.GlobalSettings.set(KeyIdMap.getId(str), str2);
        return sInstance;
    }
}
