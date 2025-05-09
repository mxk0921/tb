package com.taobao.android.editionswitcher;

import android.content.Context;
import android.util.AttributeSet;
import android.view.View;
import android.widget.FrameLayout;
import com.android.alibaba.ip.runtime.InstantReloadException;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.statistic.TBS;
import com.taobao.tao.topmultitab.service.editionswitch.IHomeEditionSwitchService;
import tb.c4b;
import tb.cqv;
import tb.kbq;
import tb.pzb;
import tb.r5a;
import tb.t2o;
import tb.w78;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes5.dex */
public class EditionSwitchView extends FrameLayout implements View.OnClickListener {
    public static volatile transient /* synthetic */ IpChange $ipChange;
    public pzb listener;
    public int viewType = 0;
    public int remindKind = 0;

    static {
        t2o.a(729808900);
    }

    public EditionSwitchView(Context context, int i, pzb pzbVar) {
        super(context);
        this.listener = pzbVar;
        setViewType(i);
    }

    public static void commitEvent(String str, int i, String str2, String str3, String str4, String str5) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("684218b7", new Object[]{str, new Integer(i), str2, str3, str4, str5});
            return;
        }
        try {
            TBS.Ext.commitEvent(str, i, str2, str3, str4, str5);
            cqv.u(str, str2 + "_BehaviX_UT", null, null, str5);
        } catch (Exception unused) {
        }
    }

    public static /* synthetic */ Object ipc$super(EditionSwitchView editionSwitchView, String str, Object... objArr) {
        str.hashCode();
        int hashCode = str.hashCode();
        throw new InstantReloadException("String switch could not find '" + str + "' with hashcode " + hashCode + " in com/taobao/android/editionswitcher/EditionSwitchView");
    }

    @Override // android.view.View.OnClickListener
    public void onClick(View view) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("8dfcefe2", new Object[]{this, view});
        }
    }

    public void onDismiss() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("cab76ab2", new Object[]{this});
        }
    }

    public void processLocationChanged(Context context, String str, boolean z) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("e33c4a59", new Object[]{this, context, str, new Boolean(z)});
            return;
        }
        traceConfirmEvent(str, z);
        IHomeEditionSwitchService iHomeEditionSwitchService = (IHomeEditionSwitchService) c4b.i().h(IHomeEditionSwitchService.class);
        if (iHomeEditionSwitchService != null) {
            iHomeEditionSwitchService.updateEditionSwitch(context, str);
        }
        pzb pzbVar = this.listener;
        if (pzbVar != null) {
            ((w78.a) pzbVar).a();
        }
    }

    public void setViewType(int i) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("486795fb", new Object[]{this, new Integer(i)});
        } else if (i >= 0 && i < 2) {
            this.viewType = i;
        }
    }

    public void traceCancelEvent() {
        String str;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("ca428c2", new Object[]{this});
        } else if (this.viewType == 0) {
            String str2 = kbq.a(getContext()).editionCode;
            String valueOf = String.valueOf(this.remindKind);
            if (kbq.d(str2)) {
                str = "htao";
            } else {
                str = "";
            }
            commitEvent("Page_Home", 2101, "button-areaautono", valueOf, str, "area=" + str2);
        } else {
            r5a.i("Page_Home", 2101, "button-selectno", "area=" + kbq.a(getContext()).editionCode);
        }
    }

    public void traceConfirmEvent(String str, boolean z) {
        String str2;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("9c690de4", new Object[]{this, str, new Boolean(z)});
        } else if (this.viewType == 0) {
            if (z) {
                str2 = "button-areaauto-confirm";
            } else {
                str2 = "button-areaautoyes";
            }
            String valueOf = String.valueOf(this.remindKind);
            String valueOf2 = String.valueOf(z ? 1 : 0);
            commitEvent("Page_Home", 2101, str2, valueOf, valueOf2, "area=" + kbq.a(getContext()).editionCode + ",page_version=" + kbq.c(getContext()).editionCode + ",option=" + str);
        } else {
            r5a.i("Page_Home", 2101, "button-selectyes", "area=" + kbq.a(getContext()).editionCode + ",page_version=" + kbq.c(getContext()).editionCode + ",option=" + str);
        }
    }

    public void traceShowEvent() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("5d91a25f", new Object[]{this});
        } else if (this.viewType == 0) {
            String valueOf = String.valueOf(this.remindKind);
            commitEvent("Page_Home", 2201, "show-areaauto", valueOf, null, "area=" + kbq.a(getContext()).editionCode);
        } else {
            r5a.i("Page_Home", 2201, "show-select", "area=" + kbq.a(getContext()).editionCode);
        }
    }

    public EditionSwitchView(Context context, AttributeSet attributeSet, int i, pzb pzbVar) {
        super(context, attributeSet);
        this.listener = pzbVar;
        setViewType(i);
    }

    public EditionSwitchView(Context context, AttributeSet attributeSet, int i, int i2, pzb pzbVar) {
        super(context, attributeSet, i);
        this.listener = pzbVar;
        setViewType(i2);
    }
}
