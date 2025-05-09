package com.taobao.android.detail2.core.mainpic.viewholder;

import android.content.Context;
import android.view.View;
import com.android.alibaba.ip.runtime.InstantReloadException;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.android.detail2.core.mainpic.viewholder.MainPicAbsViewHolder;
import tb.gbx;
import tb.so7;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes4.dex */
public class b extends gbx {
    public static volatile transient /* synthetic */ IpChange $ipChange;
    public final /* synthetic */ MainPicDinamicXViewHolder h;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public b(MainPicDinamicXViewHolder mainPicDinamicXViewHolder, View view, Context context, MainPicAbsViewHolder.a aVar) {
        super(view, context, aVar);
        this.h = mainPicDinamicXViewHolder;
    }

    public static /* synthetic */ Object ipc$super(b bVar, String str, Object... objArr) {
        str.hashCode();
        int hashCode = str.hashCode();
        throw new InstantReloadException("String switch could not find '" + str + "' with hashcode " + hashCode + " in com/taobao/android/detail2/core/mainpic/viewholder/MainPicDinamicXViewHolder$1");
    }

    @Override // tb.gbx
    public String g() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("88ab898b", new Object[]{this});
        }
        return "gaussian";
    }

    @Override // tb.gbx
    public int h() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("62e7f399", new Object[]{this})).intValue();
        }
        T t = this.h.d;
        if (t != 0) {
            return ((so7) t).c;
        }
        return -1;
    }
}
