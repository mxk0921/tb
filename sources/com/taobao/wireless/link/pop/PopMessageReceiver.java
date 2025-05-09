package com.taobao.wireless.link.pop;

import android.text.TextUtils;
import com.alibaba.fastjson.JSON;
import com.alibaba.idst.nls.nlsclientsdk.requests.Constant;
import com.android.alibaba.ip.runtime.InstantReloadException;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.accs.base.TaoBaseService;
import java.util.HashMap;
import tb.aqg;
import tb.esg;
import tb.irg;
import tb.mr4;
import tb.t2o;
import tb.xfm;
import tb.ypg;
import tb.zhm;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes.dex */
public class PopMessageReceiver extends TaoBaseService {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    static {
        t2o.a(1030750316);
    }

    public static /* synthetic */ Object ipc$super(PopMessageReceiver popMessageReceiver, String str, Object... objArr) {
        str.hashCode();
        int hashCode = str.hashCode();
        throw new InstantReloadException("String switch could not find '" + str + "' with hashcode " + hashCode + " in com/taobao/wireless/link/pop/PopMessageReceiver");
    }

    @Override // com.taobao.accs.base.AccsDataListener
    public void onBind(String str, int i, TaoBaseService.ExtraInfo extraInfo) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("3fa398db", new Object[]{this, str, new Integer(i), extraInfo});
        }
    }

    @Override // com.taobao.accs.base.AccsDataListener
    public void onResponse(String str, String str2, int i, byte[] bArr, TaoBaseService.ExtraInfo extraInfo) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("d5239c42", new Object[]{this, str, str2, new Integer(i), bArr, extraInfo});
        }
    }

    @Override // com.taobao.accs.base.AccsDataListener
    public void onSendData(String str, String str2, int i, TaoBaseService.ExtraInfo extraInfo) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("f29e89fa", new Object[]{this, str, str2, new Integer(i), extraInfo});
        }
    }

    @Override // com.taobao.accs.base.AccsDataListener
    public void onUnbind(String str, int i, TaoBaseService.ExtraInfo extraInfo) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("7b4e074", new Object[]{this, str, new Integer(i), extraInfo});
        }
    }

    @Override // com.taobao.accs.base.AccsDataListener
    public void onData(String str, String str2, String str3, byte[] bArr, TaoBaseService.ExtraInfo extraInfo) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("694255fc", new Object[]{this, str, str2, str3, bArr, extraInfo});
            return;
        }
        try {
            String str4 = new String(bArr);
            mr4.b().b = (PopMessageData) JSON.parseObject(str4, PopMessageData.class);
            if (mr4.b().b != null) {
                mr4.b().b.messageId = str3;
                if (mr4.b().b.messageType != 0 || !TextUtils.equals("true", aqg.g(ypg.e().f32260a, "is_push_alive_open", "true"))) {
                    esg.b("message_id_data", str3, str4, null);
                    irg.a("link_tag", "PopMessageReceiver === onData == data：".concat(str4));
                    zhm.r(ypg.e().f32260a, mr4.b().b);
                    xfm.c().f(ypg.e().f32260a);
                    return;
                }
                ypg.e().e = true;
                irg.a("link_tag", "PopMessageReceiver === onData == 空消息拉活：".concat(str4));
                HashMap hashMap = new HashMap();
                hashMap.put("empty_message", str4);
                hashMap.put("launchType", ypg.e().f);
                hashMap.put(Constant.PROP_MESSAGE_ID, str3);
                hashMap.put("isEmptyMessageStart", ypg.e().e + "");
                esg.b("empty_message_data", "", "", hashMap);
            }
        } catch (Throwable th) {
            irg.a("link_tag", "PopMessageReceiver === onData == 消息处理异常，流程结束：" + th.getMessage());
        }
    }
}
