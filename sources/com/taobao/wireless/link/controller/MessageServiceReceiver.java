package com.taobao.wireless.link.controller;

import com.alibaba.fastjson.JSON;
import com.android.alibaba.ip.runtime.InstantReloadException;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.accs.base.TaoBaseService;
import com.taobao.wireless.link.model.MessageData;
import tb.cno;
import tb.irg;
import tb.mr4;
import tb.t2o;
import tb.tmi;
import tb.ypg;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes.dex */
public class MessageServiceReceiver extends TaoBaseService {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    static {
        t2o.a(1030750265);
    }

    public static /* synthetic */ Object ipc$super(MessageServiceReceiver messageServiceReceiver, String str, Object... objArr) {
        str.hashCode();
        int hashCode = str.hashCode();
        throw new InstantReloadException("String switch could not find '" + str + "' with hashcode " + hashCode + " in com/taobao/wireless/link/controller/MessageServiceReceiver");
    }

    @Override // com.taobao.accs.base.AccsDataListener
    public void onBind(String str, int i, TaoBaseService.ExtraInfo extraInfo) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("3fa398db", new Object[]{this, str, new Integer(i), extraInfo});
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
            mr4.b().f24246a = (MessageData) JSON.parseObject(str4, MessageData.class);
            if (mr4.b().f24246a == null) {
                irg.a("link_tag", "MessageServiceReceiver === onData == 接收的数据解析为空，不执行消息逻辑 = ".concat(str4));
                return;
            }
            mr4.b().f24246a.message_id = str3;
            irg.a("link_tag", "MessageServiceReceiver === onData == bytes = ".concat(str4));
            tmi.a(mr4.b().f24246a.message_type).b(ypg.e().f32260a, mr4.b().f24246a);
            cno.b(ypg.e().f32260a).d("message_data", mr4.b().f24246a);
        } catch (Throwable th) {
            irg.a("link_tag", "MessageServiceReceiver === onData == 处理消息异常：" + th);
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
}
