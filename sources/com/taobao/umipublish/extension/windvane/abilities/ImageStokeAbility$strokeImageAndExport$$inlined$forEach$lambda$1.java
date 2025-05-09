package com.taobao.umipublish.extension.windvane.abilities;

import com.android.alibaba.ip.runtime.InstantReloadException;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.umipublish.extension.windvane.abilities.ImageStokeAbility;
import kotlin.Metadata;
import kotlin.jvm.internal.Lambda;
import tb.u1a;
import tb.xhv;

/* compiled from: Taobao */
@Metadata(d1 = {"\u0000\u0010\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\u0010\u0007\u001a\u00020\u00032\b\u0010\u0001\u001a\u0004\u0018\u00010\u00002\b\u0010\u0002\u001a\u0004\u0018\u00010\u0000H\n¢\u0006\u0004\b\u0004\u0010\u0005¨\u0006\u0006"}, d2 = {"", "outputPath", "base64Info", "Ltb/xhv;", "invoke", "(Ljava/lang/String;Ljava/lang/String;)V", "com/taobao/umipublish/extension/windvane/abilities/ImageStokeAbility$strokeImageAndExport$1$1", "<anonymous>"}, k = 3, mv = {1, 4, 0})
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes9.dex */
public final class ImageStokeAbility$strokeImageAndExport$$inlined$forEach$lambda$1 extends Lambda implements u1a<String, String, xhv> {
    public static volatile transient /* synthetic */ IpChange $ipChange;
    public final /* synthetic */ ImageStokeAbility.Image $image;
    public final /* synthetic */ String $marvelJSONPath$inlined;
    public final /* synthetic */ ImageStokeAbility this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ImageStokeAbility$strokeImageAndExport$$inlined$forEach$lambda$1(ImageStokeAbility.Image image, ImageStokeAbility imageStokeAbility, String str) {
        super(2);
        this.$image = image;
        this.this$0 = imageStokeAbility;
        this.$marvelJSONPath$inlined = str;
    }

    public static /* synthetic */ Object ipc$super(ImageStokeAbility$strokeImageAndExport$$inlined$forEach$lambda$1 imageStokeAbility$strokeImageAndExport$$inlined$forEach$lambda$1, String str, Object... objArr) {
        str.hashCode();
        int hashCode = str.hashCode();
        throw new InstantReloadException("String switch could not find '" + str + "' with hashcode " + hashCode + " in com/taobao/umipublish/extension/windvane/abilities/ImageStokeAbility$strokeImageAndExport$$inlined$forEach$lambda$1");
    }

    @Override // tb.u1a
    public /* bridge */ /* synthetic */ xhv invoke(String str, String str2) {
        invoke2(str, str2);
        return xhv.INSTANCE;
    }

    /* renamed from: invoke  reason: avoid collision after fix types in other method */
    public final void invoke2(String str, String str2) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("e679ae93", new Object[]{this, str, str2});
            return;
        }
        this.$image.e(str);
        this.$image.d(str2);
        ImageStokeAbility.access$checkIfFinished(this.this$0);
    }
}
