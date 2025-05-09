package com.alipay.vi.android.phone.mrpc.core;

import android.content.Context;
import com.android.alibaba.ip.runtime.InstantReloadException;
import com.android.alibaba.ip.runtime.IpChange;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes3.dex */
public class DefaultRpcClient extends RpcClient {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    /* renamed from: a  reason: collision with root package name */
    public final Context f4556a;
    public final RpcFactory b;

    public DefaultRpcClient(Context context) {
        this.f4556a = context;
    }

    public static /* synthetic */ Context access$000(DefaultRpcClient defaultRpcClient) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (Context) ipChange.ipc$dispatch("79dfbfb0", new Object[]{defaultRpcClient});
        }
        return defaultRpcClient.f4556a;
    }

    public static /* synthetic */ Object ipc$super(DefaultRpcClient defaultRpcClient, String str, Object... objArr) {
        str.hashCode();
        int hashCode = str.hashCode();
        throw new InstantReloadException("String switch could not find '" + str + "' with hashcode " + hashCode + " in com/alipay/vi/android/phone/mrpc/core/DefaultRpcClient");
    }

    @Override // com.alipay.vi.android.phone.mrpc.core.RpcClient
    public <T> T getRpcProxy(Class<T> cls, final RpcParams rpcParams) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (T) ipChange.ipc$dispatch("f7ae4294", new Object[]{this, cls, rpcParams}) : (T) new RpcFactory(new Config() { // from class: com.alipay.vi.android.phone.mrpc.core.DefaultRpcClient.1
            public static volatile transient /* synthetic */ IpChange $ipChange;

            @Override // com.alipay.vi.android.phone.mrpc.core.Config
            public String getAppKey() {
                IpChange ipChange2 = $ipChange;
                if (ipChange2 instanceof IpChange) {
                    return (String) ipChange2.ipc$dispatch("49079005", new Object[]{this});
                }
                return "";
            }

            @Override // com.alipay.vi.android.phone.mrpc.core.Config
            public Context getApplicationContext() {
                IpChange ipChange2 = $ipChange;
                if (ipChange2 instanceof IpChange) {
                    return (Context) ipChange2.ipc$dispatch("c5c75d34", new Object[]{this});
                }
                return DefaultRpcClient.access$000(DefaultRpcClient.this).getApplicationContext();
            }

            @Override // com.alipay.vi.android.phone.mrpc.core.Config
            public RpcParams getRpcParams() {
                IpChange ipChange2 = $ipChange;
                if (ipChange2 instanceof IpChange) {
                    return (RpcParams) ipChange2.ipc$dispatch("cc287401", new Object[]{this});
                }
                return rpcParams;
            }

            @Override // com.alipay.vi.android.phone.mrpc.core.Config
            public Transport getTransport() {
                IpChange ipChange2 = $ipChange;
                if (ipChange2 instanceof IpChange) {
                    return (Transport) ipChange2.ipc$dispatch("36cb0cc1", new Object[]{this});
                }
                return HttpManager.getInstance(getApplicationContext());
            }

            @Override // com.alipay.vi.android.phone.mrpc.core.Config
            public String getUrl() {
                IpChange ipChange2 = $ipChange;
                if (ipChange2 instanceof IpChange) {
                    return (String) ipChange2.ipc$dispatch("de8f0660", new Object[]{this});
                }
                return rpcParams.getGwUrl();
            }

            @Override // com.alipay.vi.android.phone.mrpc.core.Config
            public boolean isGzip() {
                IpChange ipChange2 = $ipChange;
                if (ipChange2 instanceof IpChange) {
                    return ((Boolean) ipChange2.ipc$dispatch("8b75982f", new Object[]{this})).booleanValue();
                }
                return rpcParams.isGzip();
            }

            @Override // com.alipay.vi.android.phone.mrpc.core.Config
            public String sign(Context context, String str, String str2) {
                IpChange ipChange2 = $ipChange;
                if (ipChange2 instanceof IpChange) {
                    return (String) ipChange2.ipc$dispatch("2ca88008", new Object[]{this, context, str, str2});
                }
                return "";
            }
        }).getRpcProxy(cls);
    }

    public DefaultRpcClient(Context context, Config config) {
        this.f4556a = context;
        RpcFactory rpcFactory = new RpcFactory(config);
        this.b = rpcFactory;
        rpcFactory.setContext(context);
    }

    public <T> T getRpcProxy(Class<T> cls) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (T) ipChange.ipc$dispatch("eba1321b", new Object[]{this, cls}) : (T) this.b.getRpcProxy(cls);
    }
}
