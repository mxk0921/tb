package com.etao.feimagesearch.mnn.featureextract;

import com.android.alibaba.ip.runtime.InstantReloadException;
import com.android.alibaba.ip.runtime.IpChange;
import kotlin.jvm.internal.Lambda;
import tb.d1a;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes3.dex */
public final class ImgFeatureExtractUnit$Companion$instance$2 extends Lambda implements d1a<ImgFeatureExtractUnit> {
    public static volatile transient /* synthetic */ IpChange $ipChange;
    public static final ImgFeatureExtractUnit$Companion$instance$2 INSTANCE = new ImgFeatureExtractUnit$Companion$instance$2();

    public ImgFeatureExtractUnit$Companion$instance$2() {
        super(0);
    }

    public static /* synthetic */ Object ipc$super(ImgFeatureExtractUnit$Companion$instance$2 imgFeatureExtractUnit$Companion$instance$2, String str, Object... objArr) {
        str.hashCode();
        int hashCode = str.hashCode();
        throw new InstantReloadException("String switch could not find '" + str + "' with hashcode " + hashCode + " in com/etao/feimagesearch/mnn/featureextract/ImgFeatureExtractUnit$Companion$instance$2");
    }

    /* JADX WARN: Can't rename method to resolve collision */
    @Override // tb.d1a
    public final ImgFeatureExtractUnit invoke() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (ImgFeatureExtractUnit) ipChange.ipc$dispatch("f4994cf1", new Object[]{this}) : new ImgFeatureExtractUnit(null);
    }
}
