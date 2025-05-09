package com.alipay.literpc.android.phone.mrpc.core;

import android.content.Context;
import com.android.alibaba.ip.runtime.InstantReloadException;
import com.android.alibaba.ip.runtime.IpChange;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes3.dex */
public class DefaultRpcClient extends RpcClient {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    /* renamed from: a  reason: collision with root package name */
    public final Context f3843a;

    public DefaultRpcClient(Context context) {
        this.f3843a = context;
    }

    public static /* synthetic */ Context access$000(DefaultRpcClient defaultRpcClient) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (Context) ipChange.ipc$dispatch("dcbf4d2a", new Object[]{defaultRpcClient});
        }
        return defaultRpcClient.f3843a;
    }

    public static /* synthetic */ Object ipc$super(DefaultRpcClient defaultRpcClient, String str, Object... objArr) {
        str.hashCode();
        int hashCode = str.hashCode();
        throw new InstantReloadException("String switch could not find '" + str + "' with hashcode " + hashCode + " in com/alipay/literpc/android/phone/mrpc/core/DefaultRpcClient");
    }

    public final Config a(final RpcParams rpcParams) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (Config) ipChange.ipc$dispatch("826bd478", new Object[]{this, rpcParams});
        }
        return new Config() { // from class: com.alipay.literpc.android.phone.mrpc.core.DefaultRpcClient.1
            public static volatile transient /* synthetic */ IpChange $ipChange;

            @Override // com.alipay.literpc.android.phone.mrpc.core.Config
            public Context getApplicationContext() {
                IpChange ipChange2 = $ipChange;
                if (ipChange2 instanceof IpChange) {
                    return (Context) ipChange2.ipc$dispatch("c5c75d34", new Object[]{this});
                }
                return DefaultRpcClient.access$000(DefaultRpcClient.this).getApplicationContext();
            }

            @Override // com.alipay.literpc.android.phone.mrpc.core.Config
            public RpcParams getRpcParams() {
                IpChange ipChange2 = $ipChange;
                if (ipChange2 instanceof IpChange) {
                    return (RpcParams) ipChange2.ipc$dispatch("1ecca0e7", new Object[]{this});
                }
                return rpcParams;
            }

            @Override // com.alipay.literpc.android.phone.mrpc.core.Config
            public Transport getTransport() {
                IpChange ipChange2 = $ipChange;
                if (ipChange2 instanceof IpChange) {
                    return (Transport) ipChange2.ipc$dispatch("dbd7bbab", new Object[]{this});
                }
                return HttpManager.getInstance(getApplicationContext());
            }

            @Override // com.alipay.literpc.android.phone.mrpc.core.Config
            public String getUrl() {
                IpChange ipChange2 = $ipChange;
                if (ipChange2 instanceof IpChange) {
                    return (String) ipChange2.ipc$dispatch("de8f0660", new Object[]{this});
                }
                return rpcParams.getGwUrl();
            }

            @Override // com.alipay.literpc.android.phone.mrpc.core.Config
            public boolean isGzip() {
                IpChange ipChange2 = $ipChange;
                if (ipChange2 instanceof IpChange) {
                    return ((Boolean) ipChange2.ipc$dispatch("8b75982f", new Object[]{this})).booleanValue();
                }
                return rpcParams.isGzip();
            }
        };
    }

    @Override // com.alipay.literpc.android.phone.mrpc.core.RpcClient
    public <T> T getRpcProxy(Class<T> cls, RpcParams rpcParams) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (T) ipChange.ipc$dispatch("7b1b088e", new Object[]{this, cls, rpcParams});
        }
        return (T) new RpcFactory(a(rpcParams)).getRpcProxy(cls);
    }
}
