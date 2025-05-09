package com.uc.webview.internal.setup.component;

import com.uc.webview.export.extension.ICoreVersion;
import com.uc.webview.internal.setup.component.d;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes9.dex */
interface g {

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes9.dex */
    public interface a {
        void a(int i, int i2, int i3);

        void a(int i, d.h hVar);

        void a(ICoreVersion iCoreVersion);

        void b(int i);
    }

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes9.dex */
    public static class b implements a {
        @Override // com.uc.webview.internal.setup.component.g.a
        public final void a(int i, int i2, int i3) {
        }

        @Override // com.uc.webview.internal.setup.component.g.a
        public void a(int i, d.h hVar) {
        }

        @Override // com.uc.webview.internal.setup.component.g.a
        public final void a(ICoreVersion iCoreVersion) {
        }

        @Override // com.uc.webview.internal.setup.component.g.a
        public void b(int i) {
        }
    }

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes9.dex */
    public static abstract class c implements a {

        /* renamed from: a  reason: collision with root package name */
        protected final String f14406a;
        protected int b = -10000;

        public c(String str) {
            this.f14406a = str;
        }

        @Override // com.uc.webview.internal.setup.component.g.a
        public void a(int i, int i2, int i3) {
        }

        @Override // com.uc.webview.internal.setup.component.g.a
        public final void b(int i) {
            a(i, null);
        }

        @Override // com.uc.webview.internal.setup.component.g.a
        public void a(ICoreVersion iCoreVersion) {
        }

        @Override // com.uc.webview.internal.setup.component.g.a
        public void a(int i, d.h hVar) {
            d.a(this.f14406a, i, hVar);
            this.b = i;
        }
    }
}
