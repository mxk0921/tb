package com.taobao.mytaobao.message;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import android.content.IntentFilter;
import androidx.localbroadcastmanager.content.LocalBroadcastManager;
import com.alibaba.android.ultron.vfw.instance.a;
import com.alibaba.fastjson.JSONObject;
import com.android.alibaba.ip.runtime.InstantReloadException;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.android.ultron.common.model.IDMComponent;
import com.taobao.message.biz.contacts.MessageBoxService;
import com.taobao.message.biz.contacts.UnreadInfo;
import com.taobao.message.kit.core.GlobalContainer;
import com.taobao.mytaobao.ultron.MTBPresenter;
import java.util.ArrayList;
import tb.t2o;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes7.dex */
public class UnreadWangWangMessageManager {
    public static volatile transient /* synthetic */ IpChange $ipChange = null;
    public static final String ACTION_MSG_UNREAD = "msg.action.ACTION_MPM_MESSAGE_BOX_UNREAD";

    /* renamed from: a  reason: collision with root package name */
    public final a f11215a;
    public final String b;
    public IDMComponent c;
    public final LocalBroadcastManager d;
    public final BroadcastReceiver e = new BroadcastReceiver() { // from class: com.taobao.mytaobao.message.UnreadWangWangMessageManager.1
        public static volatile transient /* synthetic */ IpChange $ipChange;

        public static /* synthetic */ Object ipc$super(AnonymousClass1 r2, String str, Object... objArr) {
            str.hashCode();
            int hashCode = str.hashCode();
            throw new InstantReloadException("String switch could not find '" + str + "' with hashcode " + hashCode + " in com/taobao/mytaobao/message/UnreadWangWangMessageManager$1");
        }

        @Override // android.content.BroadcastReceiver
        public void onReceive(Context context, Intent intent) {
            MessageBoxService messageBoxService;
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("3c04d85a", new Object[]{this, context, intent});
            } else if ("msg.action.ACTION_MPM_MESSAGE_BOX_UNREAD".equals(intent.getAction()) && (messageBoxService = (MessageBoxService) GlobalContainer.getInstance().get(MessageBoxService.class)) != null) {
                UnreadWangWangMessageManager.a(UnreadWangWangMessageManager.this, messageBoxService.getUnreadInfo());
            }
        }
    };

    static {
        t2o.a(745537744);
    }

    public UnreadWangWangMessageManager(a aVar, Context context, String str) {
        this.f11215a = aVar;
        this.b = str;
        this.d = LocalBroadcastManager.getInstance(context);
    }

    public static /* synthetic */ void a(UnreadWangWangMessageManager unreadWangWangMessageManager, UnreadInfo unreadInfo) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("db4411ce", new Object[]{unreadWangWangMessageManager, unreadInfo});
        } else {
            unreadWangWangMessageManager.b(unreadInfo);
        }
    }

    public final void b(UnreadInfo unreadInfo) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("3a101fca", new Object[]{this, unreadInfo});
            return;
        }
        if (this.c == null) {
            IDMComponent F = MTBPresenter.F(this.f11215a, this.b);
            this.c = F;
            if (F == null) {
                return;
            }
        }
        JSONObject data = this.c.getData();
        data.put("tipNumber", (Object) Integer.valueOf(unreadInfo.getTipNumber()));
        data.put("tipType", (Object) Integer.valueOf(unreadInfo.getTipType()));
        ArrayList arrayList = new ArrayList();
        arrayList.add(this.c);
        this.f11215a.e(arrayList);
    }

    public void c() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("8578757e", new Object[]{this});
        } else {
            this.d.registerReceiver(this.e, new IntentFilter("msg.action.ACTION_MPM_MESSAGE_BOX_UNREAD"));
        }
    }

    public void d() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("761571b7", new Object[]{this});
        } else {
            this.d.unregisterReceiver(this.e);
        }
    }
}
