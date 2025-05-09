package com.taobao.android.weex_ability.page;

import android.content.Context;
import android.content.Intent;
import android.graphics.Bitmap;
import android.graphics.BitmapFactory;
import android.text.TextUtils;
import android.util.Base64;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.android.weex_ability.page.a;
import com.taobao.taobao.R;
import tb.dsh;
import tb.dwh;
import tb.t2o;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes6.dex */
public class b {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    /* renamed from: a  reason: collision with root package name */
    public int f9958a = -1;
    public int b = -1;
    public Bitmap c = null;
    public String d = "";
    public String e = "";
    public Intent f = null;
    public a.AbstractC0517a g;

    static {
        t2o.a(980418658);
    }

    public int b(Context context, String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("6c672859", new Object[]{this, context, str})).intValue();
        }
        int b = dsh.b(context, str);
        this.b = b;
        return b;
    }

    public int c(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("94f08524", new Object[]{this, str})).intValue();
        }
        int i = "tb_icon_navibar_default_right".equals(str) ? R.drawable.tb_icon_navibar_default_right : -1;
        this.f9958a = i;
        return i;
    }

    public void d(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("9c820927", new Object[]{this, str});
        } else {
            this.d = str;
        }
    }

    public boolean a(String str, float f) {
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
            Bitmap c = dsh.c(BitmapFactory.decodeByteArray(decode, 0, decode.length), (int) (f / 2.0f));
            this.c = c;
            if (c == null) {
                dwh.f("MSActionBarMenuItem", replace + "is not a base64 bitmap data");
            }
        } catch (IllegalArgumentException unused) {
            dwh.f("MSActionBarMenuItem", "base64 to byteArr decode fail");
        }
        return this.c != null;
    }
}
