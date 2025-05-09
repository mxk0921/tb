package com.xiaomi.push;

import java.io.PrintStream;
import java.io.PrintWriter;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes8.dex */
public class hb extends Exception {

    /* renamed from: a  reason: collision with root package name */
    private hk f14921a;

    /* renamed from: a  reason: collision with other field name */
    private hl f1089a;

    /* renamed from: a  reason: collision with other field name */
    private Throwable f1090a;

    public hb() {
        this.f14921a = null;
        this.f1089a = null;
        this.f1090a = null;
    }

    public Throwable a() {
        return this.f1090a;
    }

    @Override // java.lang.Throwable
    public String getMessage() {
        hk hkVar;
        hl hlVar;
        String message = super.getMessage();
        if (message == null && (hlVar = this.f1089a) != null) {
            return hlVar.toString();
        }
        if (message != null || (hkVar = this.f14921a) == null) {
            return message;
        }
        return hkVar.toString();
    }

    @Override // java.lang.Throwable
    public void printStackTrace() {
        printStackTrace(System.err);
    }

    @Override // java.lang.Throwable
    public String toString() {
        StringBuilder sb = new StringBuilder();
        String message = super.getMessage();
        if (message != null) {
            sb.append(message);
            sb.append(": ");
        }
        hl hlVar = this.f1089a;
        if (hlVar != null) {
            sb.append(hlVar);
        }
        hk hkVar = this.f14921a;
        if (hkVar != null) {
            sb.append(hkVar);
        }
        if (this.f1090a != null) {
            sb.append("\n  -- caused by: ");
            sb.append(this.f1090a);
        }
        return sb.toString();
    }

    public hb(hk hkVar) {
        this.f1089a = null;
        this.f1090a = null;
        this.f14921a = hkVar;
    }

    @Override // java.lang.Throwable
    public void printStackTrace(PrintStream printStream) {
        super.printStackTrace(printStream);
        if (this.f1090a != null) {
            printStream.println("Nested Exception: ");
            this.f1090a.printStackTrace(printStream);
        }
    }

    public hb(String str) {
        super(str);
        this.f14921a = null;
        this.f1089a = null;
        this.f1090a = null;
    }

    @Override // java.lang.Throwable
    public void printStackTrace(PrintWriter printWriter) {
        super.printStackTrace(printWriter);
        if (this.f1090a != null) {
            printWriter.println("Nested Exception: ");
            this.f1090a.printStackTrace(printWriter);
        }
    }

    public hb(String str, Throwable th) {
        super(str);
        this.f14921a = null;
        this.f1089a = null;
        this.f1090a = th;
    }

    public hb(Throwable th) {
        this.f14921a = null;
        this.f1089a = null;
        this.f1090a = th;
    }
}
