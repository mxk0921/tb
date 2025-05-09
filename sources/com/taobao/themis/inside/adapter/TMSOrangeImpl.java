package com.taobao.themis.inside.adapter;

import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.android.festival.jsbridge.AliFestivalWVPlugin;
import com.taobao.orange.OConstant;
import com.taobao.themis.kernel.adapter.IConfigAdapter;
import java.util.Map;
import kotlin.Metadata;
import tb.ckf;
import tb.t2o;

/* compiled from: Taobao */
@Metadata(d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010$\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u000b\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0002\u0010\u0003J'\u0010\u0007\u001a\u0010\u0012\u0004\u0012\u00020\u0004\u0012\u0004\u0012\u00020\u0004\u0018\u00010\u00062\b\u0010\u0005\u001a\u0004\u0018\u00010\u0004H\u0016¢\u0006\u0004\b\u0007\u0010\bJ+\u0010\u000b\u001a\u0004\u0018\u00010\u00042\u0006\u0010\u0005\u001a\u00020\u00042\u0006\u0010\t\u001a\u00020\u00042\b\u0010\n\u001a\u0004\u0018\u00010\u0004H\u0016¢\u0006\u0004\b\u000b\u0010\fJ)\u0010\r\u001a\u00020\u00042\u0006\u0010\u0005\u001a\u00020\u00042\u0006\u0010\t\u001a\u00020\u00042\b\u0010\n\u001a\u0004\u0018\u00010\u0004H\u0016¢\u0006\u0004\b\r\u0010\fJ\u001f\u0010\u0011\u001a\u00020\u00102\u0006\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u000f\u001a\u00020\u000eH\u0016¢\u0006\u0004\b\u0011\u0010\u0012J\u0017\u0010\u0013\u001a\u00020\u00102\u0006\u0010\u0005\u001a\u00020\u0004H\u0016¢\u0006\u0004\b\u0013\u0010\u0014J#\u0010\u0015\u001a\u0004\u0018\u00010\u00042\u0006\u0010\u0005\u001a\u00020\u00042\b\u0010\n\u001a\u0004\u0018\u00010\u0004H\u0016¢\u0006\u0004\b\u0015\u0010\u0016J#\u0010\u0017\u001a\u0004\u0018\u00010\u00042\u0006\u0010\u0005\u001a\u00020\u00042\b\u0010\n\u001a\u0004\u0018\u00010\u0004H\u0016¢\u0006\u0004\b\u0017\u0010\u0016J\u001f\u0010\u0019\u001a\u00020\u00102\u0006\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0018\u001a\u00020\u0004H\u0016¢\u0006\u0004\b\u0019\u0010\u001a¨\u0006\u001b"}, d2 = {"Lcom/taobao/themis/inside/adapter/TMSOrangeImpl;", "Lcom/taobao/themis/kernel/adapter/IConfigAdapter;", "<init>", "()V", "", "groupName", "", "getConfigs", "(Ljava/lang/String;)Ljava/util/Map;", OConstant.DIMEN_CONFIG_NAME, AliFestivalWVPlugin.PARAMS_DEFAULT_VALUE, "getConfigByGroupAndName", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;", "getConfigByGroupAndNameFromLocal", "Lcom/taobao/themis/kernel/adapter/IConfigAdapter$a;", "configListener", "Ltb/xhv;", "registerListener", "(Ljava/lang/String;Lcom/taobao/themis/kernel/adapter/IConfigAdapter$a;)V", "unregisterListener", "(Ljava/lang/String;)V", "getCustomConfig", "(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;", "getCustomConfigByLocal", "groupKey", "clearConfigLocal", "(Ljava/lang/String;Ljava/lang/String;)V", "themis_inside_release"}, k = 1, mv = {1, 6, 0}, xi = 48)
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes9.dex */
public final class TMSOrangeImpl implements IConfigAdapter {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    static {
        t2o.a(837812302);
        t2o.a(839909461);
    }

    @Override // com.taobao.themis.kernel.adapter.IConfigAdapter
    public void clearConfigLocal(String str, String str2) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("24ead7", new Object[]{this, str, str2});
            return;
        }
        ckf.g(str, "groupName");
        ckf.g(str2, "groupKey");
        TMSOrangeProxy.INSTANCE.clearConfigLocal(str, str2);
    }

    @Override // com.taobao.themis.kernel.adapter.IConfigAdapter
    public String getConfigByGroupAndName(String str, String str2, String str3) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("eaea1109", new Object[]{this, str, str2, str3});
        }
        ckf.g(str, "groupName");
        ckf.g(str2, OConstant.DIMEN_CONFIG_NAME);
        return TMSOrangeProxy.INSTANCE.getConfigByGroupAndName(str, str2, str3);
    }

    @Override // com.taobao.themis.kernel.adapter.IConfigAdapter
    public String getConfigByGroupAndNameFromLocal(String str, String str2, String str3) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("ac4d0e8c", new Object[]{this, str, str2, str3});
        }
        ckf.g(str, "groupName");
        ckf.g(str2, OConstant.DIMEN_CONFIG_NAME);
        return TMSOrangeProxy.INSTANCE.getConfigByGroupAndNameFromLocal(str, str2, str3);
    }

    @Override // com.taobao.themis.kernel.adapter.IConfigAdapter
    public Map<String, String> getConfigs(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (Map) ipChange.ipc$dispatch("6165ac1", new Object[]{this, str});
        }
        return TMSOrangeProxy.INSTANCE.getConfigs(str);
    }

    @Override // com.taobao.themis.kernel.adapter.IConfigAdapter
    public String getCustomConfig(String str, String str2) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("3a44377c", new Object[]{this, str, str2});
        }
        ckf.g(str, "groupName");
        return TMSOrangeProxy.INSTANCE.getCustomConfig(str, str2);
    }

    @Override // com.taobao.themis.kernel.adapter.IConfigAdapter
    public String getCustomConfigByLocal(String str, String str2) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("6d54b1ba", new Object[]{this, str, str2});
        }
        ckf.g(str, "groupName");
        return TMSOrangeProxy.INSTANCE.getCustomConfigByLocal(str, str2);
    }

    @Override // com.taobao.themis.kernel.adapter.IConfigAdapter
    public void registerListener(String str, IConfigAdapter.a aVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("27d4c23d", new Object[]{this, str, aVar});
            return;
        }
        ckf.g(str, "groupName");
        ckf.g(aVar, "configListener");
        TMSOrangeProxy.INSTANCE.registerListener(str, aVar);
    }

    @Override // com.taobao.themis.kernel.adapter.IConfigAdapter
    public void unregisterListener(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("e1dfcfa1", new Object[]{this, str});
            return;
        }
        ckf.g(str, "groupName");
        TMSOrangeProxy.INSTANCE.unregisterListener(str);
    }
}
