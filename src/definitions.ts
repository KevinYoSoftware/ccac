export interface ccacPlugin {
  echo(options: { value: string }): Promise<{ value: string }>;
}
