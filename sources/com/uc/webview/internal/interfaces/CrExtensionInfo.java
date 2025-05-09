package com.uc.webview.internal.interfaces;

import android.graphics.Bitmap;
import java.util.Map;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes9.dex */
public class CrExtensionInfo {
    public static final int EXTENSION_STATUS_BLOCK = 5;
    public static final int EXTENSION_STATUS_BLOCK_LIST = 4;
    public static final int EXTENSION_STATUS_DISABLE = 2;
    public static final int EXTENSION_STATUS_ENABLE = 1;
    public static final int EXTENSION_STATUS_TERMINATE = 3;
    public static final int EXTENSION_STATUS_UNKNOWN = 0;
    public static final int EXTENSION_STORE_CHROME = 1;
    public static final int EXTENSION_STORE_EDGE = 2;
    public static final int EXTENSION_STORE_UNKNOWN = 0;
    public Map<String, Object> extras;
    public Bitmap icon;
    public String id;
    public String name;
    public int status;
    public String title;
    public int type;
}
