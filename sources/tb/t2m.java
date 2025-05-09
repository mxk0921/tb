package tb;

import android.content.Context;
import android.content.Intent;
import android.graphics.Bitmap;
import android.os.Bundle;
import android.util.Pair;
import com.alibaba.fastjson.JSON;
import com.android.alibaba.ip.runtime.InstantReloadException;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.message.notification.system.base.ILocalPush;
import com.taobao.msgnotification.mode.MsgNotficationDTO;
import com.taobao.msgnotification.notifications.template.PicText;
import org.json.JSONObject;
import tb.hh4;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes7.dex */
public class t2m extends ei0 {
    public static volatile transient /* synthetic */ IpChange $ipChange;
    public final PicText e;

    static {
        t2o.a(588251165);
    }

    public t2m(Context context, MsgNotficationDTO msgNotficationDTO, Bundle bundle, Intent intent) {
        super(context, msgNotficationDTO, bundle, intent);
        JSONObject jSONObject;
        MsgNotficationDTO msgNotficationDTO2 = this.b;
        if (msgNotficationDTO2 == null || (jSONObject = msgNotficationDTO2.sceneTemplateData) == null) {
            y7t.a("PicTextNotification", " show error,msgData==null");
        } else {
            this.e = (PicText) JSON.parseObject(jSONObject.toString(), PicText.class);
        }
    }

    public static /* synthetic */ Object ipc$super(t2m t2mVar, String str, Object... objArr) {
        switch (str.hashCode()) {
            case -1669199577:
                t2mVar.setTitle((String) objArr[0]);
                return null;
            case -1432119014:
                return new Integer(t2mVar.genPushRequestId());
            case -1304581520:
                return t2mVar.getNotificationChannel();
            case -893005340:
                return new Integer(t2mVar.getImportance());
            case -505501570:
                t2mVar.setUrl((String) objArr[0]);
                return null;
            case -423164667:
                return t2mVar.getCategory();
            case -269488515:
                return super.getPushContent();
            case -14167635:
                return t2mVar.getMessageId();
            case 1161759794:
                return new Boolean(super.onBeforeNotify());
            case 1176236886:
                return new Integer(t2mVar.getMergeType());
            case 1204303463:
                return new Boolean(t2mVar.i());
            case 1386857736:
                t2mVar.setContent((String) objArr[0]);
                return null;
            case 1458578370:
                return new Boolean(super.isEnabled());
            default:
                int hashCode = str.hashCode();
                throw new InstantReloadException("String switch could not find '" + str + "' with hashcode " + hashCode + " in com/taobao/msgnotification/local/push/PicTextNotification");
        }
    }

    @Override // tb.dw, com.taobao.message.notification.system.base.BasicLocalPush, com.taobao.message.notification.system.base.ILocalPush
    public Bitmap getLargeIcon() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (Bitmap) ipChange.ipc$dispatch("6c36bd03", new Object[]{this});
        }
        return null;
    }

    @Override // tb.ei0, com.taobao.message.notification.system.base.BasicLocalPush, com.taobao.message.notification.system.base.ILocalPush
    public Pair<String, ad2> getLargeIconURL() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (Pair) ipChange.ipc$dispatch("790c3d42", new Object[]{this});
        }
        PicText picText = this.e;
        String str = picText.bigIcon;
        if (picText != null && str != null) {
            return Pair.create(str, null);
        }
        y7t.a("PicTextNotification", " show error,picText maybe null");
        return null;
    }

    @Override // com.taobao.message.notification.system.base.BasicLocalPush, com.taobao.message.notification.system.base.ILocalPush
    public ILocalPush.Content getPushContent() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (ILocalPush.Content) ipChange.ipc$dispatch("efefee7d", new Object[]{this});
        }
        if (this.e == null) {
            return super.getPushContent();
        }
        return new ILocalPush.Content(this.e.getTitle(), this.e.getSubTitle());
    }

    @Override // tb.ei0, com.taobao.message.notification.system.base.BasicLocalPush
    public boolean isEnabled() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("56f023c2", new Object[]{this})).booleanValue();
        }
        hh4.a a2 = hh4.a();
        if ((a2 == null || !"0".equals(a2.b())) && super.isEnabled()) {
            return true;
        }
        return false;
    }

    @Override // com.taobao.message.notification.system.base.BasicLocalPush
    public boolean onBeforeNotify() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("453f0c32", new Object[]{this})).booleanValue();
        }
        MsgNotficationDTO msgNotficationDTO = this.b;
        if (msgNotficationDTO != null && msgNotficationDTO.sceneTemplateData != null && this.e != null) {
            return super.onBeforeNotify();
        }
        y7t.a("PicTextNotification", " show error,msgData==null");
        return false;
    }
}
