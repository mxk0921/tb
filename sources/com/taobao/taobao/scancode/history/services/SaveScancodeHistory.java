package com.taobao.taobao.scancode.history.services;

import android.taobao.windvane.jsbridge.WVCallBackContext;
import android.taobao.windvane.jsbridge.WindVaneInterface;
import android.text.TextUtils;
import com.alibaba.fastjson.JSON;
import com.alibaba.fastjson.JSONObject;
import com.android.alibaba.ip.runtime.InstantReloadException;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.tao.Globals;
import com.taobao.taobao.scancode.history.object.Product;
import com.taobao.taobao.scancode.history.object.ScanDo;
import java.util.Date;
import tb.agh;
import tb.dso;
import tb.ey3;
import tb.kpw;
import tb.rso;
import tb.t2o;
import tb.y7t;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes8.dex */
public class SaveScancodeHistory extends kpw {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    static {
        t2o.a(760217758);
    }

    public static /* synthetic */ Object ipc$super(SaveScancodeHistory saveScancodeHistory, String str, Object... objArr) {
        str.hashCode();
        int hashCode = str.hashCode();
        throw new InstantReloadException("String switch could not find '" + str + "' with hashcode " + hashCode + " in com/taobao/taobao/scancode/history/services/SaveScancodeHistory");
    }

    private void handleSaveBarcodeHistory(String str, String str2, String str3, String str4, int i) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("1b1298bb", new Object[]{this, str, str2, str3, str4, new Integer(i)});
            return;
        }
        ScanDo scanDo = new ScanDo();
        scanDo.setNewLogic(Boolean.TRUE);
        scanDo.setType(1);
        Product product = new Product();
        product.setType(i);
        product.setPic(str3);
        product.setTitle(str2);
        if (!TextUtils.isEmpty(str4)) {
            product.setPrice("￥" + str4);
        }
        scanDo.setProduct(product);
        scanDo.setLink(str);
        scanDo.setTime(new Date().getTime());
        dso.g(Globals.getApplication(), scanDo);
    }

    @WindVaneInterface
    public void saveBarcodeHistory(Object obj, String str) {
        int i;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("c4ba357e", new Object[]{this, obj, str});
            return;
        }
        agh.h(rso.TAG, "save Barcode History begin! " + str);
        if (!TextUtils.isEmpty(str)) {
            try {
                JSONObject parseObject = JSON.parseObject(str);
                if (parseObject != null) {
                    try {
                        i = Integer.parseInt(parseObject.getString("type"));
                    } catch (NumberFormatException unused) {
                        i = 1;
                    }
                    handleSaveBarcodeHistory(parseObject.getString("code"), parseObject.getString("title"), parseObject.getString("picUrl"), parseObject.getString("price"), i);
                }
            } catch (Exception e) {
                y7t.a(rso.TAG, e.getMessage());
            }
        }
    }

    @Override // tb.kpw
    public boolean execute(String str, String str2, WVCallBackContext wVCallBackContext) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("bcd41fd1", new Object[]{this, str, str2, wVCallBackContext})).booleanValue();
        }
        ey3.g().i("Save_history_plugin", "params", str2);
        if (!str.equals("saveBarcodeHistory")) {
            return false;
        }
        saveBarcodeHistory(wVCallBackContext, str2);
        return true;
    }
}
