package com.taobao.message.conversation;

import android.content.Context;
import android.view.View;
import com.alipay.android.msp.constants.MspFlybirdDefine;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.message.kit.core.GlobalContainer;
import com.taobao.uikit.extend.component.TBErrorView;
import kotlin.Metadata;
import kotlin.jvm.JvmStatic;
import tb.a07;
import tb.ckf;
import tb.d1a;
import tb.t2o;
import tb.xhv;

/* compiled from: Taobao */
@Metadata(d1 = {"\u00002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\u0018\u0000 \u00122\u00020\u0001:\u0001\u0012B\u0007¢\u0006\u0004\b\u0002\u0010\u0003JO\u0010\u0010\u001a\u00020\u000f2\u0006\u0010\u0005\u001a\u00020\u00042\b\u0010\u0007\u001a\u0004\u0018\u00010\u00062\b\u0010\b\u001a\u0004\u0018\u00010\u00062\b\u0010\t\u001a\u0004\u0018\u00010\u00062\b\u0010\u000b\u001a\u0004\u0018\u00010\n2\u000e\u0010\u000e\u001a\n\u0012\u0004\u0012\u00020\r\u0018\u00010\fH\u0016¢\u0006\u0004\b\u0010\u0010\u0011¨\u0006\u0013"}, d2 = {"Lcom/taobao/message/conversation/TBErrorViewService;", "Lcom/taobao/message/conversation/IErrorViewService;", "<init>", "()V", "Landroid/content/Context;", "ctx", "", "title", MspFlybirdDefine.FLYBIRD_DIALOG_SUB_TITLE, "btnTitle", "", "resId", "Lkotlin/Function0;", "Ltb/xhv;", "onClick", "Landroid/view/View;", "getErrorView", "(Landroid/content/Context;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/Integer;Ltb/d1a;)Landroid/view/View;", "Companion", "message_base_tb_release"}, k = 1, mv = {1, 4, 0})
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes7.dex */
public final class TBErrorViewService implements IErrorViewService {
    public static volatile transient /* synthetic */ IpChange $ipChange;
    public static final Companion Companion = new Companion(null);

    /* compiled from: Taobao */
    @Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u000f\u0010\u0005\u001a\u00020\u0004H\u0007¢\u0006\u0004\b\u0005\u0010\u0003¨\u0006\u0006"}, d2 = {"Lcom/taobao/message/conversation/TBErrorViewService$Companion;", "", "<init>", "()V", "Ltb/xhv;", "register", "message_base_tb_release"}, k = 1, mv = {1, 4, 0})
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes7.dex */
    public static final class Companion {
        public static volatile transient /* synthetic */ IpChange $ipChange;

        static {
            t2o.a(530579461);
        }

        private Companion() {
        }

        @JvmStatic
        public final void register() {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("9a23a9aa", new Object[]{this});
            } else {
                GlobalContainer.getInstance().register(IErrorViewService.class, new TBErrorViewService());
            }
        }

        public /* synthetic */ Companion(a07 a07Var) {
            this();
        }
    }

    static {
        t2o.a(530579460);
        t2o.a(529530906);
    }

    @JvmStatic
    public static final void register() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("9a23a9aa", new Object[0]);
        } else {
            Companion.register();
        }
    }

    @Override // com.taobao.message.conversation.IErrorViewService
    public View getErrorView(Context context, String str, String str2, String str3, Integer num, final d1a<xhv> d1aVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (View) ipChange.ipc$dispatch("d0508d8", new Object[]{this, context, str, str2, str3, num, d1aVar});
        }
        ckf.h(context, "ctx");
        final TBErrorView tBErrorView = new TBErrorView(context);
        if (str != null) {
            tBErrorView.setTitle(str);
        }
        if (str2 != null) {
            tBErrorView.setSubTitle(str2);
        }
        if (!(num == null || num.intValue() == 0)) {
            tBErrorView.setIcon(num.intValue());
        }
        if (str3 != null) {
            tBErrorView.setButton(TBErrorView.ButtonType.BUTTON_LEFT, str3, new View.OnClickListener() { // from class: com.taobao.message.conversation.TBErrorViewService$getErrorView$$inlined$let$lambda$1
                public static volatile transient /* synthetic */ IpChange $ipChange;

                @Override // android.view.View.OnClickListener
                public final void onClick(View view) {
                    IpChange ipChange2 = $ipChange;
                    if (ipChange2 instanceof IpChange) {
                        ipChange2.ipc$dispatch("8dfcefe2", new Object[]{this, view});
                        return;
                    }
                    d1a d1aVar2 = d1aVar;
                    if (d1aVar2 != null) {
                        xhv xhvVar = (xhv) d1aVar2.invoke();
                    }
                }
            });
        }
        return tBErrorView;
    }
}
