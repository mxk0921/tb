package com.taobao.browser.jsbridge.ui;

import android.content.Intent;
import android.graphics.Bitmap;
import android.graphics.BitmapFactory;
import android.text.TextUtils;
import android.util.Base64;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.browser.utils.BrowserUtil;
import com.taobao.taobao.R;
import tb.t2o;
import tb.y7t;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes6.dex */
public class ActionBarMenuItem {
    public static volatile transient /* synthetic */ IpChange $ipChange;
    public int iconResId = -1;
    public int iconFontId = -1;
    public Bitmap iconBitemap = null;
    public String title = "";
    public String href = "";
    public Intent data = null;
    public boolean stretch = false;

    static {
        t2o.a(619708554);
    }

    public int setIconFontId(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("60e1ae69", new Object[]{this, str})).intValue();
        }
        int o = BrowserUtil.o(str);
        this.iconFontId = o;
        return o;
    }

    public int setIconResId(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("94f08524", new Object[]{this, str})).intValue();
        }
        int i = "tb_icon_navibar_default_right".equals(str) ? R.drawable.tb_icon_navibar_default_right : -1;
        this.iconResId = i;
        return i;
    }

    public void setTitle(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("9c820927", new Object[]{this, str});
        } else {
            this.title = str;
        }
    }

    public boolean setIconBitmap(String str, float f) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("f0bdd309", new Object[]{this, str, new Float(f)})).booleanValue();
        }
        if (TextUtils.isEmpty(str)) {
            return false;
        }
        String replace = str.replace(' ', '+');
        try {
            byte[] decode = Base64.decode(replace, 0);
            Bitmap w = BrowserUtil.w(BitmapFactory.decodeByteArray(decode, 0, decode.length), (int) (f / 2.0f));
            this.iconBitemap = w;
            if (w == null) {
                y7t.a("ActionBarMenuItem", replace + "is not a base64 bitmap data");
            }
        } catch (IllegalArgumentException unused) {
            y7t.a("ActionBarMenuItem", "base64 to byteArr decode fail");
        }
        return this.iconBitemap != null;
    }
}
