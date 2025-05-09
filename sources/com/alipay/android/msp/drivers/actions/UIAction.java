package com.alipay.android.msp.drivers.actions;

import com.android.alibaba.ip.runtime.InstantReloadException;
import com.android.alibaba.ip.runtime.IpChange;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes3.dex */
public class UIAction implements Action {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    /* renamed from: a  reason: collision with root package name */
    public final ActionTypes f3566a;
    public final DataBundle<DataKeys, Object> b;

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes3.dex */
    public enum DataKeys implements DataKey {
        isFirstEnter,
        renderData,
        fromSync,
        data,
        action,
        exception,
        statistic;
        
        public static volatile transient /* synthetic */ IpChange $ipChange;

        public static /* synthetic */ Object ipc$super(DataKeys dataKeys, String str, Object... objArr) {
            str.hashCode();
            int hashCode = str.hashCode();
            throw new InstantReloadException("String switch could not find '" + str + "' with hashcode " + hashCode + " in com/alipay/android/msp/drivers/actions/UIAction$DataKeys");
        }

        public static DataKeys valueOf(String str) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return (DataKeys) ipChange.ipc$dispatch("de1ce46", new Object[]{str});
            }
            return (DataKeys) Enum.valueOf(DataKeys.class, str);
        }
    }

    public UIAction(ActionTypes actionTypes, DataBundle<DataKeys, Object> dataBundle) {
        this.f3566a = actionTypes;
        this.b = dataBundle;
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
        return this.f3566a;
    }

    public String toString() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("8126d80d", new Object[]{this});
        }
        return String.format("<UIAction@%d with type: %s bundle: %s>", Integer.valueOf(hashCode()), this.f3566a, this.b);
    }
}
