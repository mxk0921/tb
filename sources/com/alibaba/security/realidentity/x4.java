package com.alibaba.security.realidentity;

import android.content.Context;
import android.graphics.Point;
import android.graphics.SurfaceTexture;
import android.opengl.GLES20;
import android.opengl.GLSurfaceView;
import com.alibaba.security.plugin.beauty.BeautyRenderManager;
import com.alibaba.security.realidentity.biz.config.RPBizConfig;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.tao.messagekit.base.network.AccsConnection;
import java.nio.Buffer;
import java.nio.ByteBuffer;
import java.nio.ByteOrder;
import java.nio.FloatBuffer;
import javax.microedition.khronos.egl.EGLConfig;
import javax.microedition.khronos.opengles.GL10;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes2.dex */
public class x4 implements GLSurfaceView.Renderer {
    public static volatile transient /* synthetic */ IpChange $ipChange = null;
    public static final String p = "CameraRender";
    public static final float[] q = {1.0f, 1.0f, -1.0f, 1.0f, -1.0f, -1.0f, 1.0f, 1.0f, -1.0f, -1.0f, 1.0f, -1.0f};
    public static final float[] r = {1.0f, 1.0f, 0.0f, 1.0f, 0.0f, 0.0f, 1.0f, 1.0f, 0.0f, 0.0f, 1.0f, 0.0f};
    public static final String s = "attribute vec4 avVertex;                                              \nattribute vec4 avVertexCoordinate;                                    \nuniform mat4 umTransformMatrix;                                       \nvarying vec2 vvTextureCoordinate;                                     \nvoid main() {                                                         \n    vvTextureCoordinate= (umTransformMatrix * avVertexCoordinate).xy; \n    gl_Position = avVertex;                                           \n}                                                                     \n";
    public static final String t = "#extension GL_OES_EGL_image_external : require                       \nprecision mediump float;                                             \nuniform samplerExternalOES usTextureOes;                             \nvarying vec2 vvTextureCoordinate;                                    \nvoid main() {                                                        \n    vec4 vCameraColor = texture2D(usTextureOes, vvTextureCoordinate);\n    gl_FragColor = vCameraColor;                                     \n}                                                                    \n";

    /* renamed from: a  reason: collision with root package name */
    public final Context f2899a;
    public final z2 b;
    public int c;
    public int d;
    public int e;
    public int f;
    public int g;
    public int h;
    public int i;
    public int j;
    public float[] k = new float[16];
    public FloatBuffer l;
    public FloatBuffer m;
    public h2 n;
    public SurfaceTexture o;

    public x4(Context context, z2 z2Var, RPBizConfig rPBizConfig) {
        this.f2899a = context;
        this.b = z2Var;
        if (rPBizConfig.getDegradeConfig().isBeautyOpen) {
            try {
                this.n = (h2) BeautyRenderManager.class.newInstance();
            } catch (Throwable unused) {
            }
        }
    }

    private int a(int i, String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("20f12c98", new Object[]{this, new Integer(i), str})).intValue();
        }
        int glCreateShader = GLES20.glCreateShader(i);
        GLES20.glShaderSource(glCreateShader, str);
        GLES20.glCompileShader(glCreateShader);
        return glCreateShader;
    }

    private void b() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("57a83e9", new Object[]{this});
            return;
        }
        float[] fArr = q;
        FloatBuffer asFloatBuffer = ByteBuffer.allocateDirect(fArr.length * 4).order(ByteOrder.nativeOrder()).asFloatBuffer();
        this.l = asFloatBuffer;
        asFloatBuffer.put(fArr).position(0);
        float[] fArr2 = r;
        FloatBuffer put = ByteBuffer.allocateDirect(fArr2.length * 4).order(ByteOrder.nativeOrder()).asFloatBuffer().put(fArr2);
        this.m = put;
        put.position(0);
        this.d = GLES20.glCreateProgram();
        int a2 = a(35633, s);
        this.e = a2;
        GLES20.glAttachShader(this.d, a2);
        int a3 = a(35632, t);
        this.f = a3;
        GLES20.glAttachShader(this.d, a3);
        GLES20.glLinkProgram(this.d);
    }

    private void c() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("5889b6a", new Object[]{this});
            return;
        }
        h2 h2Var = this.n;
        if (h2Var != null) {
            h2Var.draw(this.b.a(), this.k);
        }
    }

    public SurfaceTexture e() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (SurfaceTexture) ipChange.ipc$dispatch("ddc344ab", new Object[]{this});
        }
        return this.o;
    }

    public void f() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("5b2e1ed", new Object[]{this});
            return;
        }
        SurfaceTexture surfaceTexture = this.o;
        if (surfaceTexture != null) {
            surfaceTexture.release();
            this.o = null;
        }
        this.c = -1;
        h2 h2Var = this.n;
        if (h2Var != null) {
            h2Var.release();
        }
    }

    @Override // android.opengl.GLSurfaceView.Renderer
    public void onDrawFrame(GL10 gl10) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("d186971d", new Object[]{this, gl10});
            return;
        }
        d();
        c();
    }

    @Override // android.opengl.GLSurfaceView.Renderer
    public void onSurfaceChanged(GL10 gl10, int i, int i2) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("893091d9", new Object[]{this, gl10, new Integer(i), new Integer(i2)});
            return;
        }
        GLES20.glViewport(0, 0, i, i2);
        h2 h2Var = this.n;
        if (h2Var != null) {
            h2Var.onChanged(i, i2);
        }
    }

    @Override // android.opengl.GLSurfaceView.Renderer
    public void onSurfaceCreated(GL10 gl10, EGLConfig eGLConfig) {
        h2 h2Var;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("b2ea8368", new Object[]{this, gl10, eGLConfig});
            return;
        }
        int a2 = a();
        this.c = a2;
        this.o = new SurfaceTexture(a2);
        b();
        Point e = this.b.e();
        if (e != null && (h2Var = this.n) != null) {
            h2Var.onCreated(this.f2899a, e.x, e.y, this.b.c(), this.c);
        }
    }

    private void d() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("596b2eb", new Object[]{this});
            return;
        }
        SurfaceTexture surfaceTexture = this.o;
        if (surfaceTexture != null) {
            surfaceTexture.updateTexImage();
            this.o.getTransformMatrix(this.k);
        }
        GLES20.glClearColor(1.0f, 0.0f, 0.0f, 0.0f);
        GLES20.glClear(16384);
        GLES20.glUseProgram(this.d);
        this.g = GLES20.glGetAttribLocation(this.d, "avVertex");
        this.j = GLES20.glGetAttribLocation(this.d, "avVertexCoordinate");
        this.h = GLES20.glGetUniformLocation(this.d, "umTransformMatrix");
        this.i = GLES20.glGetUniformLocation(this.d, "usTextureOes");
        GLES20.glVertexAttribPointer(this.g, 2, 5126, false, 8, (Buffer) this.l);
        GLES20.glVertexAttribPointer(this.j, 2, 5126, false, 8, (Buffer) this.m);
        GLES20.glActiveTexture(33984);
        GLES20.glBindTexture(36197, this.c);
        GLES20.glUniform1i(this.i, 0);
        GLES20.glUniformMatrix4fv(this.h, 1, false, this.k, 0);
        GLES20.glEnableVertexAttribArray(this.g);
        GLES20.glEnableVertexAttribArray(this.j);
        GLES20.glDrawArrays(4, 0, 6);
        GLES20.glDisableVertexAttribArray(this.g);
        GLES20.glDisableVertexAttribArray(this.j);
    }

    /* JADX WARN: Removed duplicated region for block: B:35:0x0092 A[Catch: IOException -> 0x005f, TRY_ENTER, TryCatch #8 {IOException -> 0x005f, blocks: (B:16:0x005b, B:19:0x0062, B:35:0x0092, B:37:0x0097, B:39:0x009c), top: B:60:0x0028 }] */
    /* JADX WARN: Removed duplicated region for block: B:37:0x0097 A[Catch: IOException -> 0x005f, TryCatch #8 {IOException -> 0x005f, blocks: (B:16:0x005b, B:19:0x0062, B:35:0x0092, B:37:0x0097, B:39:0x009c), top: B:60:0x0028 }] */
    /* JADX WARN: Removed duplicated region for block: B:39:0x009c A[Catch: IOException -> 0x005f, TRY_LEAVE, TryCatch #8 {IOException -> 0x005f, blocks: (B:16:0x005b, B:19:0x0062, B:35:0x0092, B:37:0x0097, B:39:0x009c), top: B:60:0x0028 }] */
    /* JADX WARN: Removed duplicated region for block: B:51:0x00b7 A[Catch: IOException -> 0x00b3, TryCatch #5 {IOException -> 0x00b3, blocks: (B:47:0x00af, B:51:0x00b7, B:53:0x00bc), top: B:56:0x00af }] */
    /* JADX WARN: Removed duplicated region for block: B:53:0x00bc A[Catch: IOException -> 0x00b3, TRY_LEAVE, TryCatch #5 {IOException -> 0x00b3, blocks: (B:47:0x00af, B:51:0x00b7, B:53:0x00bc), top: B:56:0x00af }] */
    /* JADX WARN: Removed duplicated region for block: B:56:0x00af A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    private java.lang.String a(android.content.Context r7, int r8) {
        /*
            Method dump skipped, instructions count: 196
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: com.alibaba.security.realidentity.x4.a(android.content.Context, int):java.lang.String");
    }

    private int a() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("56c6c5b", new Object[]{this})).intValue();
        }
        int[] iArr = new int[1];
        GLES20.glGenTextures(1, iArr, 0);
        GLES20.glBindTexture(36197, iArr[0]);
        GLES20.glTexParameterf(36197, 10241, 9728.0f);
        GLES20.glTexParameterf(36197, AccsConnection.DATA_PACKAGE_MAX, 9729.0f);
        GLES20.glTexParameterf(36197, 10242, 33071.0f);
        GLES20.glTexParameterf(36197, 10243, 33071.0f);
        GLES20.glBindTexture(36197, 0);
        return iArr[0];
    }
}
