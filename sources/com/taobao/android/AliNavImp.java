package com.taobao.android;

import android.net.Uri;
import android.os.Bundle;
import com.alibaba.fastjson.JSONObject;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.android.nav.Nav;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes4.dex */
public class AliNavImp implements AliNavInterface {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    /* renamed from: a  reason: collision with root package name */
    public final Nav f6243a;

    public AliNavImp(Nav nav) {
        this.f6243a = nav;
    }

    @Override // com.taobao.android.AliNavInterface
    public AliNavInterface b(int i) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (AliNavInterface) ipChange.ipc$dispatch("c5d7334e", new Object[]{this, new Integer(i)});
        }
        this.f6243a.forResult(i);
        return this;
    }

    @Override // com.taobao.android.AliNavInterface
    public boolean c(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("27e4e8c6", new Object[]{this, str})).booleanValue();
        }
        return this.f6243a.toUri(str);
    }

    @Override // com.taobao.android.AliNavInterface
    public AliNavInterface d(Bundle bundle) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (AliNavInterface) ipChange.ipc$dispatch("11972d60", new Object[]{this, bundle});
        }
        this.f6243a.withExtras(bundle);
        return this;
    }

    @Override // com.taobao.android.AliNavInterface
    public AliNavInterface e(int i) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (AliNavInterface) ipChange.ipc$dispatch("95cfcf69", new Object[]{this, new Integer(i)});
        }
        this.f6243a.withFlags(i);
        return this;
    }

    @Override // com.taobao.android.AliNavInterface
    public Uri f(String str, JSONObject jSONObject) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (Uri) ipChange.ipc$dispatch("e8c27ba6", new Object[]{this, str, jSONObject});
        }
        return Uri.parse(str);
    }

    @Override // com.taobao.android.AliNavInterface
    public boolean g(Uri uri) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("c3d61753", new Object[]{this, uri})).booleanValue();
        }
        return this.f6243a.toUri(uri);
    }
}
