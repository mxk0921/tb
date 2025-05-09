package com.alibaba.android.aura.datamodel.parse;

import com.alibaba.android.umf.datamodel.UMFBaseIO;
import com.alibaba.fastjson.annotation.JSONField;
import com.android.alibaba.ip.runtime.InstantReloadException;
import com.android.alibaba.ip.runtime.IpChange;
import java.util.ArrayList;
import java.util.List;
import tb.rl;
import tb.t2o;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes2.dex */
public class AURAParseIO extends UMFBaseIO {
    public static volatile transient /* synthetic */ IpChange $ipChange;
    @JSONField(name = "action")
    private String mAction;
    @JSONField(name = "data")
    private List<rl> mData;
    private String mRootKey;

    static {
        t2o.a(80740391);
    }

    public AURAParseIO(List<rl> list) {
        this.mAction = "default";
        this.mData = list;
    }

    public static /* synthetic */ Object ipc$super(AURAParseIO aURAParseIO, String str, Object... objArr) {
        str.hashCode();
        int hashCode = str.hashCode();
        throw new InstantReloadException("String switch could not find '" + str + "' with hashcode " + hashCode + " in com/alibaba/android/aura/datamodel/parse/AURAParseIO");
    }

    public String getAction() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("e81f414d", new Object[]{this});
        }
        return this.mAction;
    }

    public List<rl> getData() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (List) ipChange.ipc$dispatch("dbd142c0", new Object[]{this});
        }
        if (this.mData == null) {
            this.mData = new ArrayList();
        }
        return this.mData;
    }

    public String getRootKey() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("7cbb1772", new Object[]{this});
        }
        return this.mRootKey;
    }

    public void setAction(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("bb72d5c9", new Object[]{this, str});
        } else {
            this.mAction = str;
        }
    }

    public void setData(List<rl> list) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("28ddf4a4", new Object[]{this, list});
        } else {
            this.mData = list;
        }
    }

    public void setRootKey(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("21ab5fac", new Object[]{this, str});
        } else {
            this.mRootKey = str;
        }
    }

    public AURAParseIO(List<rl> list, String str) {
        this.mData = list;
        this.mAction = str;
    }
}
