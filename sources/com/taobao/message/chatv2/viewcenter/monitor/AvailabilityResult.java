package com.taobao.message.chatv2.viewcenter.monitor;

import com.alibaba.fastjson.JSON;
import com.alibaba.fastjson.JSONArray;
import com.android.alibaba.ip.runtime.IpChange;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import tb.t2o;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes7.dex */
public class AvailabilityResult {
    public static volatile transient /* synthetic */ IpChange $ipChange;
    private int errorCode;
    private String errorMsg;
    private List<AvailabilityError> errors = new ArrayList();
    private boolean ignore;

    static {
        t2o.a(552599628);
    }

    public int getErrorCode() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("5461de59", new Object[]{this})).intValue();
        }
        return this.errorCode;
    }

    public Object getErrorDetail() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ipChange.ipc$dispatch("46d21228", new Object[]{this});
        }
        JSONArray jSONArray = new JSONArray();
        for (AvailabilityError availabilityError : this.errors) {
            jSONArray.add(JSON.toJSON(availabilityError));
        }
        return jSONArray;
    }

    public String getErrorMsg() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("e1cc388a", new Object[]{this});
        }
        return this.errorMsg;
    }

    public List<AvailabilityError> getErrors() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (List) ipChange.ipc$dispatch("d74c36df", new Object[]{this});
        }
        return this.errors;
    }

    public boolean hasError() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("d2d4ed19", new Object[]{this})).booleanValue();
        }
        if (this.errors.size() > 0) {
            return true;
        }
        return false;
    }

    public boolean isIgnore() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("b5d54627", new Object[]{this})).booleanValue();
        }
        return this.ignore;
    }

    public void setErrorCode(int i) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("ffd0c969", new Object[]{this, new Integer(i)});
        } else {
            this.errorCode = i;
        }
    }

    public void setErrorMsg(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("e298332c", new Object[]{this, str});
        } else {
            this.errorMsg = str;
        }
    }

    public void setErrors(List<AvailabilityError> list) {
        AvailabilityError availabilityError;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("dcb37165", new Object[]{this, list});
            return;
        }
        this.errors = list;
        if (list == null) {
            this.errors = new ArrayList();
        }
        Iterator<AvailabilityError> it = this.errors.iterator();
        while (true) {
            if (!it.hasNext()) {
                availabilityError = null;
                break;
            }
            availabilityError = it.next();
            if (availabilityError.errCode == -103) {
                break;
            }
        }
        if (availabilityError != null) {
            setErrorCode(availabilityError.errCode);
            setErrorMsg(availabilityError.errMsg);
        } else if (this.errors.size() > 1) {
            setErrorCode(list.get(0).errCode);
            setErrorMsg(list.get(0).errMsg);
        }
    }

    public void setIgnore(boolean z) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("c91b4ed9", new Object[]{this, new Boolean(z)});
        } else {
            this.ignore = z;
        }
    }
}
