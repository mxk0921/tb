package com.taobao.android.weex_framework.widget;

import android.graphics.Typeface;
import android.net.Uri;
import android.text.TextUtils;
import android.util.Base64;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.android.weex_framework.MUSDKInstance;
import java.io.File;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import tb.dwh;
import tb.pg1;
import tb.t2o;
import tb.vvh;
import tb.xvh;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes6.dex */
public class FontDO {
    public static volatile transient /* synthetic */ IpChange $ipChange = null;
    public static final int STATE_FAILED = 3;
    public static final int STATE_INIT = 0;
    public static final int STATE_INVALID = -1;
    public static final int STATE_LOADING = 1;
    public static final int STATE_SUCCESS = 2;
    public static final int TYPE_BASE64 = 5;
    public static final int TYPE_FILE = 2;
    public static final int TYPE_LOCAL = 3;
    public static final int TYPE_NATIVE = 4;
    public static final int TYPE_NETWORK = 1;
    public static final int TYPE_UNKNOWN = 0;

    /* renamed from: a  reason: collision with root package name */
    public final String f9988a;
    public String b;
    public Typeface d;
    public int c = 1;
    public int e = -1;

    /* compiled from: Taobao */
    @Retention(RetentionPolicy.SOURCE)
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes6.dex */
    public @interface FontState {
    }

    /* compiled from: Taobao */
    @Retention(RetentionPolicy.SOURCE)
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes6.dex */
    public @interface FontType {
    }

    static {
        t2o.a(982516279);
    }

    public FontDO(String str, String str2, MUSDKInstance mUSDKInstance) {
        this.f9988a = str;
        this.b = str2;
        a(str2, mUSDKInstance);
    }

    public String b() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("86ed50c5", new Object[]{this});
        }
        return this.f9988a;
    }

    public int c() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("830709d5", new Object[]{this})).intValue();
        }
        return this.e;
    }

    public int d() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("5378242a", new Object[]{this})).intValue();
        }
        return this.c;
    }

    public Typeface e() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (Typeface) ipChange.ipc$dispatch("3161bb0a", new Object[]{this});
        }
        return this.d;
    }

    public String f() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("de8f0660", new Object[]{this});
        }
        return this.b;
    }

    public void g(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("e8812494", new Object[]{this, str});
        }
    }

    public void h(int i) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("bfef36d", new Object[]{this, new Integer(i)});
        } else {
            this.e = i;
        }
    }

    public void i(Typeface typeface) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("3e9d3566", new Object[]{this, typeface});
        } else {
            this.d = typeface;
        }
    }

    public final void a(String str, MUSDKInstance mUSDKInstance) {
        String str2;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("66f61149", new Object[]{this, str, mUSDKInstance});
            return;
        }
        if (str != null) {
            str2 = str.trim();
        } else {
            str2 = "";
        }
        char c = 65535;
        if (str2.isEmpty()) {
            this.e = -1;
            dwh.u(mUSDKInstance, "font url is empty");
            return;
        }
        if (str2.matches("^url\\((('.*')|(\".*\"))\\)$")) {
            Uri parse = Uri.parse(str2.substring(5, str2.length() - 2));
            if (parse != null) {
                this.b = parse.toString();
                try {
                    String scheme = parse.getScheme();
                    if (scheme == null) {
                        dwh.c(mUSDKInstance, "no scheme for font url " + this.b);
                        this.e = -1;
                        this.c = 0;
                        return;
                    }
                    switch (scheme.hashCode()) {
                        case 3076010:
                            if (scheme.equals("data")) {
                                c = 4;
                                break;
                            }
                            break;
                        case 3143036:
                            if (scheme.equals("file")) {
                                c = 2;
                                break;
                            }
                            break;
                        case 3213448:
                            if (scheme.equals("http")) {
                                c = 0;
                                break;
                            }
                            break;
                        case 99617003:
                            if (scheme.equals("https")) {
                                c = 1;
                                break;
                            }
                            break;
                        case 103145323:
                            if (scheme.equals("local")) {
                                c = 3;
                                break;
                            }
                            break;
                    }
                    if (c == 0 || c == 1) {
                        this.c = 1;
                    } else if (c == 2) {
                        this.c = 2;
                        this.b = parse.getEncodedSchemeSpecificPart();
                    } else if (c == 3) {
                        this.c = 3;
                    } else if (c != 4) {
                        dwh.c(mUSDKInstance, "unknown scheme for font url " + this.b);
                        this.c = 0;
                    } else {
                        long currentTimeMillis = System.currentTimeMillis();
                        String[] split = str2.split(",");
                        if (split != null && split.length == 2) {
                            String str3 = split[0];
                            if (!TextUtils.isEmpty(str3) && str3.endsWith("base64")) {
                                String str4 = split[1];
                                if (!TextUtils.isEmpty(str4)) {
                                    String b = xvh.b(str4);
                                    File file = new File(vvh.c().getCacheDir(), pg1.ATOM_EXT_UDL_font_family);
                                    if (!file.exists()) {
                                        file.mkdirs();
                                    }
                                    File file2 = new File(file, b);
                                    if (!file2.exists()) {
                                        file2.createNewFile();
                                        xvh.d(file2.getPath(), Base64.decode(str4, 0), vvh.c());
                                    }
                                    this.b = file2.getPath();
                                    this.c = 5;
                                    dwh.o("Parse base64 font cost " + (System.currentTimeMillis() - currentTimeMillis) + " ms");
                                }
                            }
                        }
                    }
                    this.e = 0;
                } catch (Exception e) {
                    dwh.h("convertUrl failed url is " + this.b, e);
                }
            }
        } else {
            this.b = str2;
            this.e = -1;
        }
        if (dwh.r()) {
            dwh.a("load font src: " + str2 + " parsed url " + this.b + ", type:" + this.c);
        }
    }
}
