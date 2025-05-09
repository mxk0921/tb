package com.unionpay.tsmservice.mini;

import android.os.Bundle;
import com.unionpay.tsmservice.mini.ITsmCallback;
import tb.gyu;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes9.dex */
final class UPTsmAddonMini$b extends ITsmCallback.Stub {

    /* renamed from: a  reason: collision with root package name */
    final /* synthetic */ gyu f14541a;
    private final ITsmCallback b;
    private final int c;

    private UPTsmAddonMini$b(gyu gyuVar, ITsmCallback iTsmCallback, int i) {
        this.b = iTsmCallback;
        this.c = i;
    }

    @Override // com.unionpay.tsmservice.mini.ITsmCallback
    public final void onError(String str, String str2) {
        ITsmCallback iTsmCallback = this.b;
        if (iTsmCallback != null) {
            iTsmCallback.onError(str, str2);
        }
    }

    @Override // com.unionpay.tsmservice.mini.ITsmCallback
    public final void onResult(Bundle bundle) {
        if (this.b != null) {
            bundle.putInt("interfaceId", this.c);
            this.b.onResult(bundle);
        }
    }

    public /* synthetic */ UPTsmAddonMini$b(gyu gyuVar, ITsmCallback iTsmCallback, int i, byte b) {
        this(gyuVar, iTsmCallback, i);
    }
}
