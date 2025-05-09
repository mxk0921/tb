package com.alipay.android.msp.drivers.actions;

import android.text.TextUtils;
import com.alibaba.fastjson.JSON;
import com.alibaba.fastjson.JSONObject;
import com.alipay.android.app.template.ITemplateClickCallback;
import com.android.alibaba.ip.runtime.InstantReloadException;
import com.android.alibaba.ip.runtime.IpChange;
import com.flybird.FBDocument;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes3.dex */
public class EventAction implements Action {
    public static volatile transient /* synthetic */ IpChange $ipChange = null;
    public static final String FROM_INVOKE = "invoke";
    public static final String FROM_NATIVE = "native";
    public static final String FROM_SUBMIT = "submit";

    /* renamed from: a  reason: collision with root package name */
    public final DataBundle<DataKeys, Object> f3562a;
    public Object c;
    public String d;
    public int e;
    public String f;
    public int g;
    public SubmitType h;
    public int k;
    public MspEvent[] l;
    public long m;
    public long n;
    public FBDocument q;
    public ITemplateClickCallback r;
    public boolean i = false;
    public boolean j = false;
    public String o = "native";
    public long p = 0;
    public final ActionTypes b = ActionTypes.COMMAND;

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes3.dex */
    public enum DataKeys implements DataKey {
        mspEvent;
        
        public static volatile transient /* synthetic */ IpChange $ipChange;

        public static /* synthetic */ Object ipc$super(DataKeys dataKeys, String str, Object... objArr) {
            str.hashCode();
            int hashCode = str.hashCode();
            throw new InstantReloadException("String switch could not find '" + str + "' with hashcode " + hashCode + " in com/alipay/android/msp/drivers/actions/EventAction$DataKeys");
        }

        public static DataKeys valueOf(String str) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return (DataKeys) ipChange.ipc$dispatch("77551886", new Object[]{str});
            }
            return (DataKeys) Enum.valueOf(DataKeys.class, str);
        }
    }

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes3.dex */
    public static class MspEvent {
        public static volatile transient /* synthetic */ IpChange $ipChange;

        /* renamed from: a  reason: collision with root package name */
        public String f3563a;
        public JSONObject b;
        public String[] c;

        public MspEvent() {
        }

        public String getActionName() {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return (String) ipChange.ipc$dispatch("cd957182", new Object[]{this});
            }
            return this.f3563a;
        }

        public String[] getActionParamsArray() {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return (String[]) ipChange.ipc$dispatch("c687fcfd", new Object[]{this});
            }
            return this.c;
        }

        public JSONObject getActionParamsJson() {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return (JSONObject) ipChange.ipc$dispatch("2f440c81", new Object[]{this});
            }
            return this.b;
        }

        public void setActionName(String str) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("5c024634", new Object[]{this, str});
            } else if (!TextUtils.isEmpty(str)) {
                if (str.startsWith("loc:")) {
                    str = str.substring(4);
                }
                if (str.startsWith("alias-")) {
                    str = str.substring(6);
                }
                this.f3563a = str;
            }
        }

        public void setActionParamsArray(String[] strArr) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("a68d72bd", new Object[]{this, strArr});
            } else {
                this.c = strArr;
            }
        }

        public void setActionParamsJson(JSONObject jSONObject) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("26e0e823", new Object[]{this, jSONObject});
            } else {
                this.b = jSONObject;
            }
        }

        public MspEvent(String str) {
            setActionName(str);
        }
    }

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes3.dex */
    public enum SubmitType {
        FirstRequest,
        FirstRequestAfterPage,
        CommonRequest,
        CommonRequestWithoutUI;
        
        public static volatile transient /* synthetic */ IpChange $ipChange;

        public static /* synthetic */ Object ipc$super(SubmitType submitType, String str, Object... objArr) {
            str.hashCode();
            int hashCode = str.hashCode();
            throw new InstantReloadException("String switch could not find '" + str + "' with hashcode " + hashCode + " in com/alipay/android/msp/drivers/actions/EventAction$SubmitType");
        }

        public static SubmitType valueOf(String str) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return (SubmitType) ipChange.ipc$dispatch("81e07612", new Object[]{str});
            }
            return (SubmitType) Enum.valueOf(SubmitType.class, str);
        }
    }

    public EventAction() {
        DataBundle<DataKeys, Object> dataBundle = new DataBundle<>();
        this.f3562a = dataBundle;
        dataBundle.put(DataKeys.mspEvent, this);
    }

    public String getActionData() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("90f6b5c3", new Object[]{this});
        }
        return this.d;
    }

    public int getBizId() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("14dc0c52", new Object[]{this})).intValue();
        }
        return this.k;
    }

    @Override // com.alipay.android.msp.drivers.actions.Action
    @Deprecated
    public DataBundle<DataKeys, Object> getData() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (DataBundle) ipChange.ipc$dispatch("d3409a3a", new Object[]{this});
        }
        return this.f3562a;
    }

    public int getDelayTime() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("ee424fb4", new Object[]{this})).intValue();
        }
        return this.e;
    }

    public String getEventFrom() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("1118b50b", new Object[]{this});
        }
        return this.o;
    }

    public FBDocument getInvokeDoc() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (FBDocument) ipChange.ipc$dispatch("e0b77f6c", new Object[]{this});
        }
        return this.q;
    }

    public long getInvokeFunKey() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("aa21dae9", new Object[]{this})).longValue();
        }
        return this.p;
    }

    public int getLogFieldEndCode() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("e5b198b6", new Object[]{this})).intValue();
        }
        return this.g;
    }

    public MspEvent[] getMspEvents() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (MspEvent[]) ipChange.ipc$dispatch("5315fb78", new Object[]{this});
        }
        return this.l;
    }

    public String getNetErrorCode() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("b876c64b", new Object[]{this});
        }
        return this.f;
    }

    public Object getSender() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ipChange.ipc$dispatch("2fbf8d40", new Object[]{this});
        }
        return this.c;
    }

    public long getStartDispatchTime() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("e1020e2e", new Object[]{this})).longValue();
        }
        return this.m;
    }

    public long getStartExecuteTime() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("79f8df11", new Object[]{this})).longValue();
        }
        return this.n;
    }

    public SubmitType getSubmitType() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (SubmitType) ipChange.ipc$dispatch("f23c2bc8", new Object[]{this});
        }
        return this.h;
    }

    public ITemplateClickCallback getTemplateClickCallback() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (ITemplateClickCallback) ipChange.ipc$dispatch("ca9146e7", new Object[]{this});
        }
        return this.r;
    }

    @Override // com.alipay.android.msp.drivers.actions.Action
    public ActionTypes getType() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (ActionTypes) ipChange.ipc$dispatch("9edfc33d", new Object[]{this});
        }
        return this.b;
    }

    public boolean isAjax() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("c094cdf5", new Object[]{this})).booleanValue();
        }
        return this.i;
    }

    public boolean isDelayEventType() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("fba75986", new Object[]{this})).booleanValue();
        }
        MspEvent[] mspEventArr = this.l;
        if (mspEventArr == null || mspEventArr.length != 1 || !TextUtils.equals(mspEventArr[0].getActionName(), "auth")) {
            return false;
        }
        return true;
    }

    public boolean isFromLocalEvent() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("865c480e", new Object[]{this})).booleanValue();
        }
        return this.j;
    }

    public void setActionData(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("4c98a13", new Object[]{this, str});
        } else {
            this.d = str;
        }
    }

    public void setActionParamsArray(String[] strArr) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("a68d72bd", new Object[]{this, strArr});
            return;
        }
        MspEvent[] mspEventArr = this.l;
        if (mspEventArr != null && mspEventArr.length > 0) {
            for (MspEvent mspEvent : mspEventArr) {
                mspEvent.setActionParamsArray(strArr);
            }
        }
    }

    public void setActionParamsJson(JSONObject jSONObject) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("26e0e823", new Object[]{this, jSONObject});
            return;
        }
        MspEvent[] mspEventArr = this.l;
        if (mspEventArr != null && mspEventArr.length > 0) {
            for (MspEvent mspEvent : mspEventArr) {
                mspEvent.setActionParamsJson(jSONObject);
            }
        }
    }

    public void setAjax(boolean z) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("678992cb", new Object[]{this, new Boolean(z)});
        } else {
            this.i = z;
        }
    }

    public void setBizId(int i) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("b4ca4090", new Object[]{this, new Integer(i)});
        } else {
            this.k = i;
        }
    }

    public void setDelayTime(int i) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("a1fe836e", new Object[]{this, new Integer(i)});
        } else {
            this.e = i;
        }
    }

    public void setEventFrom(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("943ba833", new Object[]{this, str});
        } else {
            this.o = str;
        }
    }

    public void setFromLocalEvent(boolean z) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("687e41d2", new Object[]{this, new Boolean(z)});
        } else {
            this.j = z;
        }
    }

    public void setInvokeDoc(FBDocument fBDocument) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("9c6e7b0c", new Object[]{this, fBDocument});
        } else {
            this.q = fBDocument;
        }
    }

    public void setInvokeFunKey(long j) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("75b006e3", new Object[]{this, new Long(j)});
        } else {
            this.p = j;
        }
    }

    public void setLogFieldEndCode(int i) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("4ad521ac", new Object[]{this, new Integer(i)});
        } else {
            this.g = i;
        }
    }

    public void setMspEvents(MspEvent[] mspEventArr) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("fecae73e", new Object[]{this, mspEventArr});
        } else {
            this.l = mspEventArr;
        }
    }

    public void setNetErrorCode(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("e700778b", new Object[]{this, str});
        } else {
            this.f = str;
        }
    }

    public void setSender(Object obj) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("7ff39e9a", new Object[]{this, obj});
        } else {
            this.c = obj;
        }
    }

    public void setStartDispatchTime(long j) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("7183cbd6", new Object[]{this, new Long(j)});
        } else {
            this.m = j;
        }
    }

    public void setStartExecuteTime(long j) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("95362dbb", new Object[]{this, new Long(j)});
        } else {
            this.n = j;
        }
    }

    public void setSubmitType(SubmitType submitType) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("8e9a270e", new Object[]{this, submitType});
        } else {
            this.h = submitType;
        }
    }

    public void setTemplateClickCallback(ITemplateClickCallback iTemplateClickCallback) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("2412684d", new Object[]{this, iTemplateClickCallback});
        } else {
            this.r = iTemplateClickCallback;
        }
    }

    public String toString() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("8126d80d", new Object[]{this});
        }
        return String.format("<EventAction@%d with type: %s from: %s data: %s>", Integer.valueOf(hashCode()), this.b, this.o, this.d);
    }

    public void setMspActionFromScheme(String str, String str2, String str3) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("c856ad92", new Object[]{this, str, str2, str3});
        } else if (TextUtils.equals(str, MspEventTypes.ACTION_INVOKE_LOC)) {
            this.l = r6;
            MspEvent[] mspEventArr = {new MspEvent(str2)};
            if (!TextUtils.isEmpty(str3)) {
                this.l[0].setActionParamsJson(JSON.parseObject(str3));
            }
        }
    }

    public EventAction(String str) {
        DataBundle<DataKeys, Object> dataBundle = new DataBundle<>();
        this.f3562a = dataBundle;
        dataBundle.put(DataKeys.mspEvent, this);
        this.l = r0;
        MspEvent[] mspEventArr = {new MspEvent(str)};
    }
}
