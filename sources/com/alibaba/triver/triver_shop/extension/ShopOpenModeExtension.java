package com.alibaba.triver.triver_shop.extension;

import android.net.Uri;
import com.alibaba.ariver.integration.ipc.server.RVAppRecord;
import com.alibaba.triver.extensions.DefOpenModeExtension;
import com.alibaba.triver.point.TriverOpenModeProxy;
import com.android.alibaba.ip.runtime.InstantReloadException;
import com.android.alibaba.ip.runtime.IpChange;
import java.util.List;
import tb.pks;
import tb.pwr;
import tb.t2o;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes3.dex */
public class ShopOpenModeExtension extends DefOpenModeExtension {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    static {
        t2o.a(766509304);
    }

    public static /* synthetic */ Object ipc$super(ShopOpenModeExtension shopOpenModeExtension, String str, Object... objArr) {
        int hashCode = str.hashCode();
        if (hashCode == -1991742357) {
            return ShopOpenModeExtension.super.getSingleMode((String) objArr[0], (Uri) objArr[1]);
        }
        if (hashCode == -488249507) {
            return new Integer(ShopOpenModeExtension.super.getMaxInstanceCount((String) objArr[0], (Uri) objArr[1]));
        }
        if (hashCode == 263446360) {
            return ShopOpenModeExtension.super.getOpenMode((String) objArr[0], (Uri) objArr[1], (List) objArr[2]);
        }
        int hashCode2 = str.hashCode();
        throw new InstantReloadException("String switch could not find '" + str + "' with hashcode " + hashCode2 + " in com/alibaba/triver/triver_shop/extension/ShopOpenModeExtension");
    }

    public int getMaxInstanceCount(String str, Uri uri) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("e2e5e75d", new Object[]{this, str, uri})).intValue();
        }
        return ShopOpenModeExtension.super.getMaxInstanceCount(str, uri);
    }

    public TriverOpenModeProxy.OpenMode getOpenMode(String str, Uri uri, List<RVAppRecord> list) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (TriverOpenModeProxy.OpenMode) ipChange.ipc$dispatch("fb3df58", new Object[]{this, str, uri, list});
        }
        if (!pks.v(uri.toString())) {
            return ShopOpenModeExtension.super.getOpenMode(str, uri, list);
        }
        if (pwr.v()) {
            return TriverOpenModeProxy.OpenMode.SINGLE_INSTANCE;
        }
        return TriverOpenModeProxy.OpenMode.MULTI_INSTANCE;
    }

    public TriverOpenModeProxy.SingleMode getSingleMode(String str, Uri uri) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (TriverOpenModeProxy.SingleMode) ipChange.ipc$dispatch("89486c6b", new Object[]{this, str, uri});
        }
        if (pks.v(uri.toString())) {
            return TriverOpenModeProxy.SingleMode.NEW_INSTANCE;
        }
        return ShopOpenModeExtension.super.getSingleMode(str, uri);
    }
}
