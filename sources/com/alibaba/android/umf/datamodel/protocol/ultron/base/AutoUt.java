package com.alibaba.android.umf.datamodel.protocol.ultron.base;

import com.alibaba.android.umf.datamodel.protocol.ultron.BaseProtocol;
import com.alibaba.fastjson.JSONObject;
import com.alibaba.fastjson.annotation.JSONField;
import com.android.alibaba.ip.runtime.InstantReloadException;
import com.android.alibaba.ip.runtime.IpChange;
import tb.t2o;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes2.dex */
public class AutoUt extends BaseProtocol {
    public static volatile transient /* synthetic */ IpChange $ipChange;
    @JSONField(name = "arg1")
    private String mArg1;
    @JSONField(name = "arg2")
    private String mArg2;
    @JSONField(name = "arg3")
    private String mArg3;
    @JSONField(name = "args")
    private JSONObject mArgs;
    @JSONField(name = "autoUt")
    private String mAutoUt;
    private String mPageName;

    static {
        t2o.a(80740669);
    }

    public static /* synthetic */ Object ipc$super(AutoUt autoUt, String str, Object... objArr) {
        str.hashCode();
        int hashCode = str.hashCode();
        throw new InstantReloadException("String switch could not find '" + str + "' with hashcode " + hashCode + " in com/alibaba/android/umf/datamodel/protocol/ultron/base/AutoUt");
    }

    public String getArg1() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("715cfa88", new Object[]{this});
        }
        return this.mArg1;
    }

    public String getArg2() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("f7e2b527", new Object[]{this});
        }
        return this.mArg2;
    }

    public String getArg3() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("7e686fc6", new Object[]{this});
        }
        return this.mArg3;
    }

    public JSONObject getArgs() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (JSONObject) ipChange.ipc$dispatch("7c869f7a", new Object[]{this});
        }
        return this.mArgs;
    }

    public String getPageName() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("707fddc9", new Object[]{this});
        }
        return this.mPageName;
    }

    public boolean isAutoUt() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("6de5b303", new Object[]{this})).booleanValue();
        }
        return Boolean.valueOf(this.mAutoUt).booleanValue();
    }

    public void setArg1(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("4ec196ee", new Object[]{this, str});
        } else {
            this.mArg1 = str;
        }
    }

    public void setArg2(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("98f3302f", new Object[]{this, str});
        } else {
            this.mArg2 = str;
        }
    }

    public void setArg3(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("e324c970", new Object[]{this, str});
        } else {
            this.mArg3 = str;
        }
    }

    public void setArgs(JSONObject jSONObject) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("9679c24a", new Object[]{this, jSONObject});
        } else {
            this.mArgs = jSONObject;
        }
    }

    public void setAutoUt(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("148e641", new Object[]{this, str});
        } else {
            this.mAutoUt = str;
        }
    }

    public void setPageName(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("2a5935cd", new Object[]{this, str});
        } else {
            this.mPageName = str;
        }
    }

    public AutoUt clone() throws CloneNotSupportedException {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (AutoUt) ipChange.ipc$dispatch("d46eef3f", new Object[]{this});
        }
        AutoUt autoUt = (AutoUt) super.clone();
        if (this.mArgs != null) {
            JSONObject jSONObject = new JSONObject();
            jSONObject.putAll(this.mArgs);
            autoUt.setArgs(jSONObject);
        }
        return autoUt;
    }
}
