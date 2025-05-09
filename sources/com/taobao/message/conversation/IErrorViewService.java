package com.taobao.message.conversation;

import android.content.Context;
import android.view.View;
import com.alipay.android.msp.constants.MspFlybirdDefine;
import kotlin.Metadata;
import tb.d1a;
import tb.xhv;

/* compiled from: Taobao */
@Metadata(d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\bf\u0018\u00002\u00020\u0001JO\u0010\u000e\u001a\u00020\r2\u0006\u0010\u0003\u001a\u00020\u00022\b\u0010\u0005\u001a\u0004\u0018\u00010\u00042\b\u0010\u0006\u001a\u0004\u0018\u00010\u00042\b\u0010\u0007\u001a\u0004\u0018\u00010\u00042\b\u0010\t\u001a\u0004\u0018\u00010\b2\u000e\u0010\f\u001a\n\u0012\u0004\u0012\u00020\u000b\u0018\u00010\nH&¢\u0006\u0004\b\u000e\u0010\u000f¨\u0006\u0010"}, d2 = {"Lcom/taobao/message/conversation/IErrorViewService;", "", "Landroid/content/Context;", "ctx", "", "title", MspFlybirdDefine.FLYBIRD_DIALOG_SUB_TITLE, "btnTitle", "", "resId", "Lkotlin/Function0;", "Ltb/xhv;", "onClick", "Landroid/view/View;", "getErrorView", "(Landroid/content/Context;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/Integer;Ltb/d1a;)Landroid/view/View;", "message_base_release"}, k = 1, mv = {1, 4, 0})
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes7.dex */
public interface IErrorViewService {
    View getErrorView(Context context, String str, String str2, String str3, Integer num, d1a<xhv> d1aVar);
}
