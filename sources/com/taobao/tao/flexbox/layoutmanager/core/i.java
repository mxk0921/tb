package com.taobao.tao.flexbox.layoutmanager.core;

import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.tao.flexbox.layoutmanager.ac.d;
import tb.t2o;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes8.dex */
public interface i {

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes8.dex */
    public static class a implements i {
        public static volatile transient /* synthetic */ IpChange $ipChange;

        static {
            t2o.a(503317086);
            t2o.a(503317085);
        }

        @Override // com.taobao.tao.flexbox.layoutmanager.core.i
        public void appendJSLog(int i, String str, boolean z) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("ab6b5ccf", new Object[]{this, new Integer(i), str, new Boolean(z)});
            }
        }

        @Override // com.taobao.tao.flexbox.layoutmanager.core.i
        public void appendModuleExecuteCallback(d.j jVar, Object obj, boolean z) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("90fe7440", new Object[]{this, jVar, obj, new Boolean(z)});
            }
        }

        @Override // com.taobao.tao.flexbox.layoutmanager.core.i
        public void appendModuleExecuteInfo(d.j jVar) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("e9da3b6f", new Object[]{this, jVar});
            }
        }

        @Override // com.taobao.tao.flexbox.layoutmanager.core.i
        public void appendTNodeLog(int i, String str, String str2) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("2d265368", new Object[]{this, new Integer(i), str, str2});
            }
        }

        @Override // com.taobao.tao.flexbox.layoutmanager.core.i
        public void destroy() {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("89c49781", new Object[]{this});
            }
        }

        @Override // com.taobao.tao.flexbox.layoutmanager.core.i
        public void flick(n nVar) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("e5198a80", new Object[]{this, nVar});
            }
        }

        @Override // com.taobao.tao.flexbox.layoutmanager.core.i
        public void onCancel(int i, int i2) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("c56f55a0", new Object[]{this, new Integer(i), new Integer(i2)});
            }
        }

        @Override // com.taobao.tao.flexbox.layoutmanager.core.i
        public void onMove(int i, int i2) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("25839977", new Object[]{this, new Integer(i), new Integer(i2)});
            }
        }

        @Override // com.taobao.tao.flexbox.layoutmanager.core.i
        public void onPause() {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("2f87fc5e", new Object[]{this});
            }
        }

        @Override // com.taobao.tao.flexbox.layoutmanager.core.i
        public void onResume() {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("a5d6cd73", new Object[]{this});
            }
        }

        @Override // com.taobao.tao.flexbox.layoutmanager.core.i
        public void setEnableDebugTool(boolean z) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("a0170767", new Object[]{this, new Boolean(z)});
            }
        }

        @Override // com.taobao.tao.flexbox.layoutmanager.core.i
        public void showTool(boolean z) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("be25e618", new Object[]{this, new Boolean(z)});
            }
        }
    }

    void appendJSLog(int i, String str, boolean z);

    void appendModuleExecuteCallback(d.j jVar, Object obj, boolean z);

    void appendModuleExecuteInfo(d.j jVar);

    void appendTNodeLog(int i, String str, String str2);

    void destroy();

    void flick(n nVar);

    void onCancel(int i, int i2);

    void onMove(int i, int i2);

    void onPause();

    void onResume();

    void setEnableDebugTool(boolean z);

    void showTool(boolean z);
}
