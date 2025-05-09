package com.etao.feimagesearch.album.thumbnail;

import com.android.alibaba.ip.runtime.InstantReloadException;
import com.android.alibaba.ip.runtime.IpChange;
import com.meizu.cloud.pushsdk.notification.model.AdvanceSetting;
import kotlin.jvm.internal.Lambda;
import tb.att;
import tb.ckf;
import tb.g1a;
import tb.xhv;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes3.dex */
public final class MediaThumbnailExecutor$executeTask$asyncTask$1 extends Lambda implements g1a<att, xhv> {
    public static volatile transient /* synthetic */ IpChange $ipChange;
    public final /* synthetic */ att $task;
    public final /* synthetic */ MediaThumbnailExecutor this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public MediaThumbnailExecutor$executeTask$asyncTask$1(MediaThumbnailExecutor mediaThumbnailExecutor, att attVar) {
        super(1);
        this.this$0 = mediaThumbnailExecutor;
        this.$task = attVar;
    }

    public static /* synthetic */ Object ipc$super(MediaThumbnailExecutor$executeTask$asyncTask$1 mediaThumbnailExecutor$executeTask$asyncTask$1, String str, Object... objArr) {
        str.hashCode();
        int hashCode = str.hashCode();
        throw new InstantReloadException("String switch could not find '" + str + "' with hashcode " + hashCode + " in com/etao/feimagesearch/album/thumbnail/MediaThumbnailExecutor$executeTask$asyncTask$1");
    }

    @Override // tb.g1a
    public /* bridge */ /* synthetic */ xhv invoke(att attVar) {
        invoke2(attVar);
        return xhv.INSTANCE;
    }

    /* renamed from: invoke  reason: avoid collision after fix types in other method */
    public final void invoke2(att attVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("fee6d369", new Object[]{this, attVar});
            return;
        }
        ckf.g(attVar, AdvanceSetting.NETWORK_TYPE);
        MediaThumbnailExecutor.c(this.this$0).remove(this.$task);
    }
}
