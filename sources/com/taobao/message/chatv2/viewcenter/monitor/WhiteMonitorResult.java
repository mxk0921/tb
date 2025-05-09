package com.taobao.message.chatv2.viewcenter.monitor;

import com.alibaba.fastjson.JSON;
import com.alibaba.fastjson.JSONArray;
import com.alibaba.fastjson.JSONObject;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.message.kit.util.ConfigUtil;
import java.util.ArrayList;
import java.util.List;
import tb.t2o;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes7.dex */
public class WhiteMonitorResult {
    public static volatile transient /* synthetic */ IpChange $ipChange;
    private final double monitorCountRate;
    private final double monitorErrorRate;
    private int totalChildViewCount;
    private int totalViewCount;
    private int validChildViewCount;
    private List<WhiteMonitorError> errors = new ArrayList();
    private List<String> contentList = new ArrayList();

    static {
        t2o.a(552599630);
    }

    public WhiteMonitorResult(String str) {
        String value = ConfigUtil.getValue("tb_message_stable_probe", "white_space_element_rate", "{\"default\":50}");
        String value2 = ConfigUtil.getValue("tb_message_stable_probe", "white_space_error_rate", "{\"default\":20}");
        JSONObject parseObject = JSON.parseObject(value);
        JSONObject parseObject2 = JSON.parseObject(value2);
        if (parseObject.containsKey(str)) {
            this.monitorCountRate = parseObject.getDoubleValue(str);
        } else {
            this.monitorCountRate = parseObject.getDoubleValue("default");
        }
        if (parseObject2.containsKey(str)) {
            this.monitorErrorRate = parseObject2.getDoubleValue(str);
        } else {
            this.monitorErrorRate = parseObject2.getDoubleValue("default");
        }
    }

    public void addChildViewError(WhiteMonitorError whiteMonitorError) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("2a23a211", new Object[]{this, whiteMonitorError});
            return;
        }
        this.errors.add(whiteMonitorError);
        this.totalViewCount++;
        this.totalChildViewCount++;
    }

    public void addValidChildView() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("534e89cd", new Object[]{this});
            return;
        }
        this.validChildViewCount++;
        this.totalChildViewCount++;
        this.totalViewCount++;
    }

    public void addValidContent(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("218e9c2f", new Object[]{this, str});
        } else {
            this.contentList.add(str);
        }
    }

    public void addValidViewGroup() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("237f5a46", new Object[]{this});
        } else {
            this.totalViewCount++;
        }
    }

    public void addViewGroupError(WhiteMonitorError whiteMonitorError) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("a8827d38", new Object[]{this, whiteMonitorError});
            return;
        }
        this.errors.add(whiteMonitorError);
        this.totalViewCount++;
    }

    public List<String> getContentList() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (List) ipChange.ipc$dispatch("87a839bf", new Object[]{this});
        }
        return this.contentList;
    }

    public String getErrorCode() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("f72feefa", new Object[]{this});
        }
        if (this.validChildViewCount / this.totalChildViewCount < this.monitorCountRate / 100.0d) {
            return "101";
        }
        return "102";
    }

    public Object getErrorDetail() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ipChange.ipc$dispatch("46d21228", new Object[]{this});
        }
        JSONArray jSONArray = new JSONArray();
        for (WhiteMonitorError whiteMonitorError : this.errors) {
            jSONArray.add(JSON.toJSON(whiteMonitorError));
        }
        return jSONArray;
    }

    public String getErrorMsg() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("e1cc388a", new Object[]{this});
        }
        if (this.validChildViewCount / this.totalChildViewCount < this.monitorCountRate / 100.0d) {
            return "元素数过少:" + this.validChildViewCount;
        }
        return "可见区域过少:" + (this.errors.size() / this.totalViewCount);
    }

    public boolean hasError() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("d2d4ed19", new Object[]{this})).booleanValue();
        }
        if (this.validChildViewCount / this.totalChildViewCount < this.monitorCountRate / 100.0d || this.errors.size() / this.totalViewCount > this.monitorErrorRate / 100.0d) {
            return true;
        }
        return false;
    }
}
