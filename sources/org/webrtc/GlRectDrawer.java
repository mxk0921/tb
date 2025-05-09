package org.webrtc;

import com.android.alibaba.ip.runtime.InstantReloadException;
import com.android.alibaba.ip.runtime.IpChange;
import org.webrtc.GlGenericDrawer;
import tb.t2o;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes10.dex */
public class GlRectDrawer extends GlGenericDrawer {
    public static volatile transient /* synthetic */ IpChange $ipChange = null;
    private static final String FRAGMENT_SHADER = "void main() {\n  gl_FragColor = sample(tc);\n}\n";

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes10.dex */
    public static class ShaderCallbacks implements GlGenericDrawer.ShaderCallbacks {
        public static volatile transient /* synthetic */ IpChange $ipChange;

        static {
            t2o.a(395313770);
            t2o.a(395313766);
        }

        private ShaderCallbacks() {
        }

        @Override // org.webrtc.GlGenericDrawer.ShaderCallbacks
        public void onNewShader(GlShader glShader) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("5a180a53", new Object[]{this, glShader});
            }
        }

        @Override // org.webrtc.GlGenericDrawer.ShaderCallbacks
        public void onPrepareShader(GlShader glShader, float[] fArr, int i, int i2, int i3, int i4) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("8a0e7897", new Object[]{this, glShader, fArr, new Integer(i), new Integer(i2), new Integer(i3), new Integer(i4)});
            }
        }
    }

    static {
        t2o.a(395313768);
    }

    public GlRectDrawer() {
        super(FRAGMENT_SHADER, new ShaderCallbacks());
    }

    public static /* synthetic */ Object ipc$super(GlRectDrawer glRectDrawer, String str, Object... objArr) {
        switch (str.hashCode()) {
            case -1893526538:
                super.drawYuv((int[]) objArr[0], (float[]) objArr[1], ((Number) objArr[2]).intValue(), ((Number) objArr[3]).intValue(), ((Number) objArr[4]).intValue(), ((Number) objArr[5]).intValue(), ((Number) objArr[6]).intValue(), ((Number) objArr[7]).intValue());
                return null;
            case -1401612498:
                super.drawOes(((Number) objArr[0]).intValue(), (float[]) objArr[1], ((Number) objArr[2]).intValue(), ((Number) objArr[3]).intValue(), ((Number) objArr[4]).intValue(), ((Number) objArr[5]).intValue(), ((Number) objArr[6]).intValue(), ((Number) objArr[7]).intValue());
                return null;
            case 86450622:
                super.drawRgb(((Number) objArr[0]).intValue(), (float[]) objArr[1], ((Number) objArr[2]).intValue(), ((Number) objArr[3]).intValue(), ((Number) objArr[4]).intValue(), ((Number) objArr[5]).intValue(), ((Number) objArr[6]).intValue(), ((Number) objArr[7]).intValue());
                return null;
            case 212160782:
                super.release();
                return null;
            default:
                int hashCode = str.hashCode();
                throw new InstantReloadException("String switch could not find '" + str + "' with hashcode " + hashCode + " in org/webrtc/GlRectDrawer");
        }
    }

    @Override // org.webrtc.GlGenericDrawer, org.webrtc.RendererCommon.GlDrawer
    public /* bridge */ /* synthetic */ void drawOes(int i, float[] fArr, int i2, int i3, int i4, int i5, int i6, int i7) {
        super.drawOes(i, fArr, i2, i3, i4, i5, i6, i7);
    }

    @Override // org.webrtc.GlGenericDrawer, org.webrtc.RendererCommon.GlDrawer
    public /* bridge */ /* synthetic */ void drawRgb(int i, float[] fArr, int i2, int i3, int i4, int i5, int i6, int i7) {
        super.drawRgb(i, fArr, i2, i3, i4, i5, i6, i7);
    }

    @Override // org.webrtc.GlGenericDrawer, org.webrtc.RendererCommon.GlDrawer
    public /* bridge */ /* synthetic */ void drawYuv(int[] iArr, float[] fArr, int i, int i2, int i3, int i4, int i5, int i6) {
        super.drawYuv(iArr, fArr, i, i2, i3, i4, i5, i6);
    }

    @Override // org.webrtc.GlGenericDrawer, org.webrtc.RendererCommon.GlDrawer
    public /* bridge */ /* synthetic */ void release() {
        super.release();
    }
}
