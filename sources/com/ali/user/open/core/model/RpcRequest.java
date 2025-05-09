package com.ali.user.open.core.model;

import android.text.TextUtils;
import android.util.Pair;
import com.ali.user.open.core.util.MtopApiHelper;
import com.android.alibaba.ip.runtime.IpChange;
import java.util.ArrayList;
import tb.t2o;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes2.dex */
public class RpcRequest {
    public static volatile transient /* synthetic */ IpChange $ipChange;
    public String mtopInstanceName;
    public int mtopInstanceType;
    public String target;
    public String version;
    public boolean NEED_ECODE = false;
    public boolean NEED_SESSION = false;
    public boolean SHOW_LOGIN_UI = true;
    public ArrayList<String> paramNames = new ArrayList<>();
    public ArrayList<Object> paramValues = new ArrayList<>();

    static {
        t2o.a(71303202);
    }

    public void addParam(String str, Object obj) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("71b71899", new Object[]{this, str, obj});
            return;
        }
        this.paramNames.add(str);
        this.paramValues.add(obj);
    }

    public void setNewMtopApi() {
        Pair<String, String> pair;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("dad209fb", new Object[]{this});
        } else if (!TextUtils.isEmpty(this.target) && MtopApiHelper.useNewApi(this.target) && (pair = MtopApiHelper.NEW_API.get(this.target)) != null) {
            this.target = (String) pair.first;
            this.version = (String) pair.second;
        }
    }

    public String toString() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("8126d80d", new Object[]{this});
        }
        return "RpcRequest [target=" + this.target + ", version=" + this.version + ", params=]";
    }
}
