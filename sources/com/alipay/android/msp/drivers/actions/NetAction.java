package com.alipay.android.msp.drivers.actions;

import com.android.alibaba.ip.runtime.InstantReloadException;
import com.android.alibaba.ip.runtime.IpChange;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes3.dex */
public class NetAction implements Action {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    /* renamed from: a  reason: collision with root package name */
    public final ActionTypes f3565a;
    public int retryCount = 0;
    public final DataBundle<DataKeys, Object> b = new DataBundle<>();

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes3.dex */
    public enum DataKeys implements DataKey {
        actionJson,
        contentData,
        isFirstRequest,
        statistic,
        callback;
        
        public static volatile transient /* synthetic */ IpChange $ipChange;

        public static /* synthetic */ Object ipc$super(DataKeys dataKeys, String str, Object... objArr) {
            str.hashCode();
            int hashCode = str.hashCode();
            throw new InstantReloadException("String switch could not find '" + str + "' with hashcode " + hashCode + " in com/alipay/android/msp/drivers/actions/NetAction$DataKeys");
        }

        public static DataKeys valueOf(String str) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return (DataKeys) ipChange.ipc$dispatch("e9512cc9", new Object[]{str});
            }
            return (DataKeys) Enum.valueOf(DataKeys.class, str);
        }
    }

    public NetAction(ActionTypes actionTypes) {
        this.f3565a = actionTypes;
    }

    public <V> V get(DataKeys dataKeys, Class<V> cls) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (V) ipChange.ipc$dispatch("bf351e38", new Object[]{this, dataKeys, cls});
        }
        Object obj = this.b.get(dataKeys, null);
        if (cls.isInstance(obj)) {
            return cls.cast(obj);
        }
        return null;
    }

    @Override // com.alipay.android.msp.drivers.actions.Action
    public DataBundle<DataKeys, Object> getData() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (DataBundle) ipChange.ipc$dispatch("d3409a3a", new Object[]{this});
        }
        return this.b;
    }

    @Override // com.alipay.android.msp.drivers.actions.Action
    public ActionTypes getType() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (ActionTypes) ipChange.ipc$dispatch("9edfc33d", new Object[]{this});
        }
        return this.f3565a;
    }

    public <V> NetAction put(DataKeys dataKeys, V v) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (NetAction) ipChange.ipc$dispatch("b9ed105e", new Object[]{this, dataKeys, v});
        }
        this.b.put(dataKeys, v);
        return this;
    }

    public String toString() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("8126d80d", new Object[]{this});
        }
        return String.format("<NetAction@%d with type: %s bundle: %s>", Integer.valueOf(hashCode()), this.f3565a, this.b);
    }
}
